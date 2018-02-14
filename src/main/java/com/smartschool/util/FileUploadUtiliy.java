package com.smartschool.util;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtiliy {
	
	private static final String ABS_PATH = "G:\\Anand Rathod\\New folder\\PayrollHRM\\src\\main\\webapp\\resources\\img\\";
	private static String REAL_PATH = "";
	private static final Logger logger = LoggerFactory.getLogger(FileUploadUtiliy.class);
	public static void uploadFile(HttpServletRequest request, MultipartFile file, String code) {
		
				// get the real server path
				REAL_PATH = request.getSession().getServletContext().getRealPath("\\resources\\img\\");
				
				logger.info(REAL_PATH);	
				
				// create the directories if it does not exist
				
				if(!new File(REAL_PATH).exists()) {
					new File(REAL_PATH).mkdirs();
				}
				
				if(!new File(ABS_PATH).exists()) {
					new File(ABS_PATH).mkdirs();
				}
				
				try {
					//transfer the file to both the location
					file.transferTo(new File(REAL_PATH + code + ".jpg"));
					file.transferTo(new File(ABS_PATH + code + ".jpg"));
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
		//		return true;
		
	}
	
	
}
