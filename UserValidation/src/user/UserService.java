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
	
	// Read the Data from the data.txt file
		public void setUserArray() {

			BufferedReader fileReader = null;
			
			try {
				
				fileReader = new BufferedReader(new FileReader("data.txt"));
				
				//Gets number of lines for the array & sets it to linesInFile array
				int numberOfLine = 0;
				while (fileReader.readLine() != null) {
					
					numberOfLine++;
				}
				//linesInFile[i] can be used to access the i'th line in the file
				String[] linesInFile = new String[numberOfLine];
				
				numberOfLine = 0; //reusing counter
				//Reset buffer - returns null if excluded
				fileReader = new BufferedReader(new FileReader("data.txt"));
				String line;
				while ((line = fileReader.readLine()) != null) {
					linesInFile[numberOfLine] = line;
					numberOfLine++;
				}
				System.out.println(linesInFile[0]);
				System.out.println(linesInFile[1]);
				System.out.println(linesInFile[2]);
				System.out.println(linesInFile[3]);
				
				
				
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

		}
		
		//The method will take the file array and parse it
		public String[] parseStringArray(String[] array) {
			
			User[] arrays = array;
			
			for(int i = 0; i < arrays.length; i++) {
				
				System.out.println(arrays[i]);
			}
			
		}
}
