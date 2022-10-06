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
		
		public void createUserArray() throws FileNotFoundException, IOException{

			BufferedReader fileReader = null;
			String [] linesInFile = null;
			
			try {
				
				fileReader = new BufferedReader(new FileReader("data.txt"));
				
				//Gets number of lines for the array
				int numberOfLine = 0;
				while (fileReader.readLine() != null) {
					
					numberOfLine++;
				}

				//linesInFile[i] can be used to access the i'th line in the file
				linesInFile = new String[numberOfLine];
				
				//Closes first fileReader
				fileReader.close();
				
				//Reset buffer - returns null if excluded
				fileReader = new BufferedReader(new FileReader("data.txt"));
				
				String line = null;
				int i = 0; //new counter
				
				while ((line = fileReader.readLine()) != null) {
					linesInFile[numberOfLine] = line;
					users[i] = new User(line.split(","));
					numberOfLine++;
					
				}			
			} finally {
				
					fileReader.close();
				
			  }

		}
		
		public User validateUserInput(String username, String password) {
			
			
			
			return null;
			
		}

}