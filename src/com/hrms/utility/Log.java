package com.hrms.utility;

import org.apache.log4j.Logger;

public class Log
{
	//Initialize log4j logs
	private static Logger Log = Logger.getLogger(Log.class.getName());
	public static void info(String message) {
		Log.info(message);
	}
}
