package user;
//Help with validating if the inputed username/password matches User Array
//Provides service of reading data from the file
//Creates the User Array

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserService {

	//User Array from Stored File
	User[] users = new User[3];
	String[] userInfo = new String[3];
	
	// Read the Data from the data.txt file
		@SuppressWarnings("resource")
		public String[] setUserArray() {

			BufferedReader fileReader = null;
			String [] linesInFile = null;
			
			try {
				
				fileReader = new BufferedReader(new FileReader("data.txt"));
				
				//Gets number of lines for the array & sets it to linesInFile array
				int numberOfLine = 0;
				while (fileReader.readLine() != null) {
					
					numberOfLine++;
				}
				//linesInFile[i] can be used to access the i'th line in the file
				linesInFile = new String[numberOfLine];
				
				numberOfLine = 0; //reusing counter
				//Reset buffer - returns null if excluded
				fileReader = new BufferedReader(new FileReader("data.txt"));
				String line;
				while ((line = fileReader.readLine()) != null) {
					linesInFile[numberOfLine] = line;
					numberOfLine++;
				}			
			} catch (FileNotFoundException e) {
				System.out.println("Oops, file not found");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("Oops, there was an I/O Exception");
				e.printStackTrace();
			} finally {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			  }
			return linesInFile;

		}
		
		public String[] setUserInfoStrings() {
			userInfo = setUserArray();
			int i;
			
			for(i = 0; i < userInfo.length; i++) {
				
				userInfo[i] = userInfo[i].toString();
				//System.out.println("Java String Array " + i + ": " + userInfo[i]);	
			}
			
			return userInfo;
		}
		
		//I dont know how to store this correctly
		public String[] parseUserInfo() {
			
			
			String[] array = new String[3];
			array = null;
			
			for(String arg : parseUserInfo()) {
				
				array = arg.split(",");
				
				System.out.println(array[1]);
			}
			
			return array;
		}
		
		public void createUser() {

			
		}
}