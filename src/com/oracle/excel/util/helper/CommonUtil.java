/**
 * 
 */
package com.oracle.excel.util.helper;

import java.io.Closeable;

/**
 * @author raparash
 *
 */
public class CommonUtil {
	
	/**
	 * Safely trims a string, if the given string
	 * is null then returns Empty String
	 * @param text
	 * @return
	 */
	public static String safeTrim(String text){
		String value="";
		if(text!=null)
			value=text.trim();
		return value;
	}
	
	/**
	 * Safely Closes closeable objects
	 * @param closeables
	 */
	public static void safeClose(Closeable... closeables){
		try{
			if(closeables!=null){
				for(Closeable closeable:closeables){
					closeable.close();
				}
			}
		}catch(Exception e){
			
		}
	}

}
