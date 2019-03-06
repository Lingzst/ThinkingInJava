package com.lingzst.exceptions;

import java.io.*;
import java.util.logging.*;

class LoggingException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger("LoggingExceptions");
	public LoggingException() {
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}
public class LoggingExceptions {
	
}
