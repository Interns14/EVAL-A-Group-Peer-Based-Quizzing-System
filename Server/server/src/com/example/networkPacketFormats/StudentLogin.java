package com.example.networkPacketFormats;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;



public class StudentLogin extends Thread{
	
	private DatagramSocket sock;
	private Connection con;
	private ArrayList<Student> studentsList;
	
	public StudentLogin(Connection databaseConnection) {
		try 
		{
			con = databaseConnection;
			sock = new DatagramSocket(null);
			// Set the socket to reuse the address
			sock.setReuseAddress(true);
			sock.bind(new InetSocketAddress(Utilities.authServerPort));
                        
                        sock.setSoTimeout(500);
                        
                        /*
                            Get studentList from the static class
                        */
			studentsList = StudentListHandler.getList();
		} 
		catch (SocketException e){
			e.printStackTrace();
		}
                
	}
        
	public void run()
	{
		
            while( true )
            {
                try 
		{
		    byte[] buffer = new byte[Utilities.MAX_BUFFER_SIZE];
                    
		    DatagramPacket pack =  new DatagramPacket(buffer, buffer.length);
		    
		    sock.receive(pack);
		    
                    System.out.println("Recvd packy");
                    
		    InetAddress clientIP = pack.getAddress();
		    
		    Packet data_packet = (Packet)Utilities.deserialize(buffer);
                    
                    /*
                        First check if it is a password change packet.
                        If it is then just serve the request and return
                    */
                                                 
                    int currentPacketSeq = data_packet.seq_no;
                    
                    System.out.println("Current seqno "+currentPacketSeq);
                    
                    AuthPacket auth_packet = null;
                    
                    if( data_packet.type == PacketTypes.AUTHENTICATION_CHANGE_PASS && data_packet.ack == false )
                    {
                        
                        auth_packet = (AuthPacket)Utilities.deserialize(data_packet.data);
                        String old_pass = auth_packet.password;
                        String new_pass = auth_packet.new_password;
                        String uid  = auth_packet.userID;
                        /*
                            Change the password
                        */
                        AuthPacket apSend = null;
                        
                        if( changePassword(uid, old_pass, new_pass) == true )
                        {
                            apSend = new AuthPacket(true, true);
                        }
                        else
                        {
                            apSend  = new AuthPacket(true, false);
                        }
                        
                        Packet p = new Packet(currentPacketSeq, PacketTypes.AUTHENTICATION_CHANGE_PASS, true, Utilities.serialize(apSend));

                        byte[] buf = Utilities.serialize(p);
		
                        DatagramPacket packy = new DatagramPacket(buf, buf.length, clientIP, Utilities.authClientPort);
		
                        sock.send(packy);
                        
                        continue;
                    }
	    	

		    if( data_packet.type != PacketTypes.AUTHENTICATION_LOGIN || data_packet.ack != false )
		    {
		    	/*
		    	 *  Send denyAccess to the client, so that the client would send the request again
		    	 */
                        /*
                            Here the standard is not required. So that is why i am passing 0 as the argument
                        */
                        
                        /*
                            Discard the packet
                        */
		    	continue;
		    }
                  
                    System.out.println("data packet "+data_packet.data+" overall : "+data_packet);
                    
		    auth_packet = (AuthPacket)Utilities.deserialize(data_packet.data);
                    
                      
                    System.out.println("user is : "+auth_packet.userID+" password is "+auth_packet.password);
                    
                    
		    HashMap<String,String> studentNameAndStd = verifyDetails(auth_packet.userID, auth_packet.password);
		    
                    String studentName = null;
                    
                    /*
                        Gets student name
                    */

		    if( studentNameAndStd != null )
		    {
                        Set<String> set = studentNameAndStd.keySet();
                        
                        for( String s :  set )
                        {
                            studentName = s;
                        }
                    
                        /*
                            Gets standard
                        */
                        byte standard = Byte.parseByte(studentNameAndStd.get(studentName));
                    
                        System.out.println("Standard is "+standard);
                    
		    	/*
		    	 * Student is authentic, Now check if the student's record has already been stored
		    	 */
                        
		    	Student pres_stud = isPresent(auth_packet.userID);
                        
		    	if( pres_stud != null )
		    	{
		    		/*
		    		 * Student record is already present in the students list.
		    		 */
		    		if( pres_stud.IP.equals(clientIP) )
			    	{
		    			grantAccess(currentPacketSeq, true,clientIP, Utilities.NO_ERROR, studentName, standard);
		    			continue;
			    	}
			    	else
			    	{
			    		/*
			    		 * Student is logging in from different Tablet(IP)
			    		 */
			    		grantAccess(currentPacketSeq, false, clientIP, Utilities.ALREADY_LOGGED, studentName, standard);
			    	}
		    	}
		    	else
		    	{
		    		/*
		    		 * Student request is new, Add an entry into the list, and send an ack to him
		    		 */
		    		grantAccess(currentPacketSeq, true, clientIP, Utilities.NO_ERROR, studentName, standard);
		    		addStudent(clientIP,auth_packet.userID, studentName);
		    	}
		    }
		    else
		    {
		    	/*
		    	 * Entered credentials by the student didn't match with any of the records in the database
		    	 * Send him -ve reply
		    	 */
		    	grantAccess(currentPacketSeq, false,clientIP, Utilities.INVALID_USER_PASS, studentName, (byte)0);
		    }
		}
                catch( SocketTimeoutException ste )
                {
                    /*
                        Listen again
                    */
                        continue;
                }
		catch (SocketException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
            }
	}
        
        private boolean changePassword(String uid, String old_pass, String new_pass )
        {
           
            try {
                
                PreparedStatement p = (PreparedStatement)con.prepareStatement("update student_info set password = '"+new_pass+"' where password = '"+old_pass+"' and roll_number = '"+uid+"'");
                int rows = p.executeUpdate();
                if( rows >= 1 )
                {
                    System.out.println("Changed password for "+uid);
                    return true;
                }
                else
                {
                    return false;
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }
	
	private void grantAccess(int currentPacketSeq, boolean flag,InetAddress clientIP, byte errorCode, String name, byte standard)
	{
		AuthPacket ap = null;
		if( flag == false )
		{
			/*
			 * Use error code to convey the type of error
			 */
			ap = new AuthPacket(true, flag, errorCode);
		}
		else
		{
			ap = new AuthPacket(true, flag);
		}
		ap.studentName = name;
                ap.standard = standard;
                
                System.out.println("Sending seq no "+currentPacketSeq);
		Packet p = new Packet(currentPacketSeq, PacketTypes.AUTHENTICATION_LOGIN, true, Utilities.serialize(ap));
		
		byte[] buf = Utilities.serialize(p);
		
		DatagramPacket pack = new DatagramPacket(buf, buf.length, clientIP, Utilities.authClientPort);
		
		try {
			sock.send(pack);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public HashMap<String,String> verifyDetails(String id, String password)
	{
		String name = null;
		try {
			// Prepare the statement to be executed on the database with the necessary query string
			int id_int;
			try
			{
				 /*
				  * Check if the UID String is an Integer
				  */
				 id_int = Integer.parseInt(id);
			}
			catch( NumberFormatException e )
			{
                                    return null;
			}
			PreparedStatement p = (PreparedStatement)con.prepareStatement("select * from student_info where roll_number='"+id_int+
																"' and password='"+password+"'");
			ResultSet result = p.executeQuery();
			// result will initially point to the record before the 1st record. To access the 1st record, use result.next().
			// If it returns null, then the teacher won't be authenticated with the given details
			if( result.next() )
			{
				// After getting the matched record from the database, we extract the Student name and his standard
				
                                HashMap<String,String> hm = new HashMap<>();
                                System.out.println("STANDARD IS "+result.getString("std"));
                                hm.put(result.getString("name"),result.getString("std"));
                                return hm;
			}
			else
			{
				// UserID and Password doesn't exist in the database
				return null;
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Error in the database query ");
		System.exit(0);// included for completeness
		return null;
	}
	
	void addStudent(InetAddress ip, String uid, String name)
	{
		// Add student to the list
		Student s = new Student(ip, uid, name);
		studentsList.add(s);
		//System.out.println("Students list count : "+studentsList.size());
	}
        
	Student isPresent(String id)
	{
		for(Student s : studentsList)
		{
			if( s.uID.equals(id))
			{
				return s;
			}
		}
		return null;
	}
}
