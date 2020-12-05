package com.PrestaShop.AllureAttach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ReadWriteProperty {
	
	private static Map<String, String> map = new HashMap<>();
	
	public static void write(String key, String value){
		map.put(key, value);
	}
	
	public static String read(String key){
		return map.get(key);
	}
	
	
	
//	public static void write(String key, String value) {
//
//		Properties prop = new Properties();
//
//		try (OutputStream output = new FileOutputStream(AllureUUID.file, true);){
//	        prop.setProperty(key, value);
//	        System.out.println("Ключ значение: " + key + " --- " + value);
//	        System.out.println(AllureUUID.file.exists() );
//	        prop.store(output, null);
//	    } catch (IOException io) {
//	        io.printStackTrace();
//	    } 
//	}
//	
//	public static String read(String key) {
//		
//		Properties prop = new Properties();
//		
//	    try (InputStream input = new FileInputStream(AllureUUID.file);){
//	      prop.load(input);
//	      System.out.println(key + " --- " + prop.getProperty(key));
//	    } catch (IOException ex) {
//	        ex.printStackTrace();
//	    }
//	    
//	    return prop.getProperty(key);
//	}	
}
