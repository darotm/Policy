package dataSource;

import java.io.IOException;

public class Constant {
	
	public static String Driver_ZSI, Driver_ODS, url_ZSI, url_ODS, user_ZSI, user_ODS, password_ZSI, password_ODS, PathTestData, PathFile, FileTestData, SheetName;
	public static String[] getConstants = new String[13];	
	static String file = "C:\\Users\\JF225657\\Documents\\Eclipse\\Policy_2\\src\\dataSource\\ConstantsPolicy.txt";
	public static void getConstant() throws IOException{
	
	 int x = 0;
	 java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(file)));
	 String line = null;
	 while ((line = br.readLine()) != null){
		 getConstants[x] = line;
	       x++;
	 }
	 br.close();
	 
	 Driver_ZSI  = getConstants[0];
	 Driver_ODS  = getConstants[1];
	 url_ZSI = getConstants[2];
	 url_ODS = getConstants[3];
	 user_ZSI = getConstants[4];
	 user_ODS = getConstants[5];
	 password_ZSI = getConstants[6];
	 password_ODS = getConstants[7];
	 PathTestData = getConstants[8];
	 PathFile = getConstants[9];
	 FileTestData = getConstants[10];	 
	 SheetName = getConstants[11];
	 
	 
    }
	
			
}
		

