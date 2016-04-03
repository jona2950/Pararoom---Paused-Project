package pardiarom.main.test.methods;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import pardiarom.ai.database.sql.AI_DATABASE_HANDLER;

public class AI_RUNNER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AI_DATABASE_HANDLER aidb = new AI_DATABASE_HANDLER();
		
		String[] VAR = new String[6] ;
		
		//In database handler, use substring, and then concatenation, an enum of constant commands 
		VAR[0] = "ref int PRIMARY KEY";
		VAR[1] = "title VARCHAR(255) NOT NULL UNIQUE";
		VAR[2] = "description VARCHAR(255)";
		VAR[3] = "textfile LONGBLOB";
		VAR[4] = "keywords VARCHAR(255) NOT NULL";
		VAR[5] = "added DATE"; 
		
		try {
			aidb.getConnection();
		
			
			try {
				aidb.create_table("Learn_INPUT", VAR);
			} catch (FileNotFoundException fnf)
			{
				fnf.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
