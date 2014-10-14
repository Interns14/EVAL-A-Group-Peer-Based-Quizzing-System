package com.example.networkPacketFormats;

import java.io.Serializable;

public class GroupNameSelectionPacket implements Serializable{
	
	static final long serialVersionUID = 4212L;
	public String groupName;
	public String studentID;
	public String studentName;
	public boolean accepted;
	
	public GroupNameSelectionPacket(String gname, String studID, String studName)
	{
		groupName = gname;
		studentID = studID;
		studentName = studName;
	}
        public GroupNameSelectionPacket(boolean flag)
        {
            groupName = null;
            studentID = null;
            studentName = null;
            accepted = flag;
        }
}
