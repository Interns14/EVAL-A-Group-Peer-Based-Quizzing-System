package StaticAttributes;

import com.carouseldemo.main.*;

import java.util.ArrayList;

import com.example.networkPacketFormats.*;

public class QuizAttributes {
	public static byte noOfOnlineStudents;
	public static byte noOfLeaders;
	public static byte sizeOfGroup;
	public static byte noOfRounds;
	public static String subject;
	public static String studentID;
	public static String studentName;
	public static String[] selectedLeaders;
	//public static ArrayList<Student> groupMembers;
	public static byte standard;
	public static Student leader;
	public static String groupName;
	static
	{
		noOfOnlineStudents = -1;
		noOfLeaders  = -1;
		sizeOfGroup = -1;
		noOfRounds = -1;
		subject = "";
		studentID = "";
		selectedLeaders = null;
		//groupMembers = null;
		leader = null;
	}
}
