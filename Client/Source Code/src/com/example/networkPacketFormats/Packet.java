package com.example.networkPacketFormats;

import java.io.Serializable;


public class Packet implements Serializable {
	
	public static final long serialVersionUID = 42L;
	public int seq_no; 			// This will be the packet identifier
	public byte type;			// This will be the type of the packet
	public boolean ack;
	public byte[] data;			// This holds a serialized object of the class according to the flags set above.
	public Packet(int seq_no, byte type, boolean ack, byte[] data)
	{
		this.seq_no = seq_no;
		this.type = type;
		this.ack = ack;
		this.data = data;
	}
}