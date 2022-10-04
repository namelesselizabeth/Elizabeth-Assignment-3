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
	//Parse the data.txt into lines
	String[] array = new String[3];
	
	// Read the Data from the data.txt file
		public void readFileSetArray() {

			BufferedReader fileReader = null;
			
			try {
				fileReader = new BufferedReader(new FileReader("data.txt"));
				int i = 0;
				String line = null;
				while (fileReader.readLine() != null) {
					array[i] = line;
					i++;
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

		}
		
		public User[] setStoredUsers(String[] input) {
			
			users[0] = parseTextLine(array[0]);
			
			
		}
		
		//The method will take the string array and parse it
		public String[] parseTextLine(String[] input) {
			
			String[] arrays = null;
			
			for (String arg : parseTextLine(input)) {
				
				arrays = arg.split(",");
			}
			
			return arrays;
		}
}
