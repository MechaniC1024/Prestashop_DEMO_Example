package com.PrestaShop.PrepareFramework;

import java.io.File;
import java.io.IOException;

import org.aeonbits.owner.ConfigFactory;

import com.PrestaShop.AllureAttach.AllureUUID;
import com.PrestaShop.AllureXML.XML;
import com.PrestaShop.DataResources.GetUrl;

public class PrepareFramework {

	public static void main(String[] args) {

		File file_Config = AllureUUID.file;

		if (file_Config.exists()) {
			file_Config.delete();
			try {
				file_Config.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		GetUrl url = ConfigFactory.create(GetUrl.class);

		String mainSite = "Shop";
		String adminSite = "Admin panel";

		XML xml = new XML();
		File file_Env = xml.getEnvironmentAllureFile();

		if (file_Env.exists())
			file_Env.delete();

		try {
			file_Env.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		xml.createXMLDocument().createRootXML().createXMLParameter(mainSite, url.urlSite())
				.createXMLParameter(adminSite, url.urlAdmin()).writeToXMLFile();
	}
}