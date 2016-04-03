package pardiarom.ai.database.sql;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


import com.mysql.jdbc.ResultSetMetaData;

/**
 * 
 * @author Jonathan
 *	This class is used for execution of commands, while maintaining a sql syntax check before execution
 */

public class AI_DATABASE_HANDLER{
	
	private Connection conn = null;

	
	private Object password = "pi=3.1415926535897932";
	private Object userName = "root";
	private Object dbms = "mysql";
	private String serverName = "localhost";
	private String portNumber = "3306";
	private String dbName = "aion_project_1";	
	
//	
//	private Object password = "AION.1.mstr-0182";
//	private Object userName = "aion_p";
//	private Object dbms = "mysql";
//	private String serverName = "192.168.6.147";
//	private String portNumber = "3306";
//	private String dbName = "aion_project_1";
	
	
	
	//Constant variables 
	private final String insertVariable = "%s";
	
	//add an arrayList to track tables in accessed database 
	ArrayList<String> tableMap = new ArrayList<>();
	
	
	
	public AI_DATABASE_HANDLER() {

		
		
	}
	
	public AI_DATABASE_HANDLER(Object password, Object userName, Object dbms,
			String serverName, String portNumber, String dbName) {
		super();
		this.password = password;
		this.userName = userName;
		this.dbms = dbms;
		this.serverName = serverName;
		this.portNumber = portNumber;
		this.dbName = dbName;
	}
	
	public Connection getConnection() throws SQLException {

		if (conn == null)
		{
		    Properties connectionProps = new Properties();
		    connectionProps.put("user", this.userName);
		    connectionProps.put("password", this.password);

		    if (this.dbms.equals("mysql")) {
		        conn = DriverManager.getConnection(
		                   "jdbc:" + this.dbms + "://" +
		                   this.serverName +
		                   ":" + this.portNumber + "/" + 
		                   dbName,
		                   connectionProps);
		    }
		    
		    query_database();
		    
		    System.out.println("Connected to database");
		}
	    
	    return conn;
	}

	public Connection execute_modification(String statement) throws SQLException {
	    
	    Statement myStmt = conn.createStatement();
	    
	    myStmt.executeUpdate(statement);
	    
	    
	    return conn;
	}
	
	public Connection execute_query(String statement) throws SQLException {
	    
	    Statement myStmt = conn.createStatement();
	    
	    myStmt.execute(statement);
	    
	    
	    return conn;
	}
	
	private void query_database() throws SQLException
	{
		//execute_query_command
		/**
		 * below is code being tested, or in temporary use
		 */
		
	    //Object used for executing a SQL statement and returning results
	    Statement myStmt = conn.createStatement();
	    
	    //used exclusively for store database returns when statements are executed
	    ResultSet myRs = myStmt.executeQuery("SHOW TABLES FROM " + dbName);
	   
	    //Object to gather information about types and properties of columns
	    ResultSetMetaData rsmd = (ResultSetMetaData) myRs.getMetaData();

	    //Loops thru the returned results until there is no next
	    while (myRs.next())
		{
	    	// query result is saved into a string variable
	    	String queryResult = myRs.getString(rsmd.getColumnLabel(1)).toLowerCase();
			if (!containsEqualsIgnoreCase(tableMap, queryResult))
			{
		    	tableMap.add(queryResult);
			}
	    	//prints entity of column
			System.out.println(queryResult);
		}
	    
	}
	
	/**
	 * checks a collection for a possible matching value
	 * @param c used to pass a collection to be examined
	 * @param s the value looking to seen for any matches
	 * @return a only if value is matched within collection a true is returned
	 */
	private boolean containsEqualsIgnoreCase(Collection<String> c, String s) {
		   for (String str : c) {
		      if (s.equalsIgnoreCase(str)) {
		          return true;
		      }
		   }
		   return false;
		}
	
	//Name should be table formatter
	public void create_table(String tableName, String VAR[]) throws FileNotFoundException
	{
		//execute_query_command
		
		//First check if table already exists
		if (containsEqualsIgnoreCase(tableMap, tableName))
		{
			System.out.printf("Table name, '%s' already exists", tableName);
		}
		else {
			
			//Local variables
			StringBuilder tableCreator = new StringBuilder(tableName);
			
			//name length will be used to find insertion point
			int tableNameSize = tableCreator.length();
			
			//template of a table
			final String TABLE_TEMPLATE = "CREATE TABLE %s();";
			final int INSERTION_POINT = 14;
			
			//Format the string to fit the name in
			Formatter fmat = new Formatter();
			fmat.format(TABLE_TEMPLATE, tableName);
			
			//replaces from 0, until the end of the name length with new string
			tableCreator.replace(0, tableNameSize, fmat.toString());
			
			String sub = null;
			for(int i=0;i<VAR.length;i++)
			{
				sub += VAR[i]; 
				if (i != VAR.length - 1)
				{
					sub += ",";
				}
			}
			
			tableCreator.insert( INSERTION_POINT+tableNameSize, sub);
			
			try {
				execute_query(tableCreator.toString());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(tableCreator.toString());
		}
		
	}
	
	

}


