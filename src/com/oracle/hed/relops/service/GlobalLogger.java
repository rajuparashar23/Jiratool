/**
 * 
 */
package com.oracle.hed.relops.service;

import java.io.OutputStream;
import java.util.logging.Level;

import com.oracle.logging.InMemoryLogger;

/**
 * @author raparash
 *
 */
public class GlobalLogger {

	private static final InMemoryLogger logger=new InMemoryLogger();
	
	public static void log(Level level,String message){
		logger.log(level, message);
	}
	
	public static String writeLog(OutputStream outputStream){
		return logger.writeLog(outputStream);
	}
}
