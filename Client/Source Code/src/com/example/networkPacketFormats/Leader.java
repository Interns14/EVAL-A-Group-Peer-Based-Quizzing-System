package com.example.networkPacketFormats;

import java.io.Serializable;

public class Leader implements Serializable
{
	public static final long serialVersionUID = 191249L;
	public String name;
	public String id;
	public Leader(String n, String id)
	{
		this.name = n;
		this.id = id;
	}
}