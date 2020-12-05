package com.PrestaShop.AllureAttach;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ReadWriteProperty {
	
	public static void write(String key, String value) {

		Properties prop = new Properties();

		try (OutputStream output = new FileOutputStream(AllureUUID.file, true);){
	        prop.setProperty(key, value);
	        prop.store(output, null);
	    } catch (IOException io) {
		System.out.println("Выкинуто исключение при записи в файл.");
	        io.printStackTrace();
	    } 
	}
	
	public static String read(String key) {
		
		Properties prop = new Properties();
		
	    try (InputStream input = new FileInputStream(AllureUUID.file);){
	      prop.load(input);
	      System.out.println(key + " --- " + prop.getProperty(key));
	    } catch (IOException ex) {
		System.out.println("Выкинуто исключение при чтении из файла.");
	        ex.printStackTrace();
	    }
	    
	    return prop.getProperty(key);
	}	
}
