package pardiarom.ai.database.sql.commands;

import java.io.IOException;

import pardiarom.ai.database.sql.commands.SqlSyntaxCommands.DataMainipulation;


public class SqlCommands implements Command 
{

	public  void select_MySql_QueryAgent(){
		
	}
	
	//might be considered exclusive
	public  void select_MySql_database_change(){
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
	
}




		//sqlCommands //REV:2
		enum databaseCommands {
			/** native database commands  
			*	if required, substring, formatters, ...e
			* for commands with bracket(s) rendered & as well if could be used, KEYWORD "NOT NULL", additonaly more.
			*///catch syntax errors, try to correct or deny
			
			//column increase to adopt parameters
			

			
			//bol_command_input - bol_column_parm_adopt - 
			//	- bol_column_adopt_ - String column_indentifier

			FROM 	(false, true, false, "FROM"){
				public void properties()
				{					
					syntax = new SqlSyntaxCommands();
					System.out.println(syntax.toString());
				}
				protected mainipulation data_manipulation_statements()
				{
					return null;
					
				}
			},
			TABLES	(false, true, false, "TABLES"),
			
			SHOW 	(false, true , true, "SHOW"),
			
			SELECT 	(true, true, true, "SELECT"),
			WHERE 	(true, true, true, "WHERE");
			
			 // REQIURES (ADOPT)
			 /*** using regex  to allow multiple properties 
			 *****^ (e.g. (01), do nothing, add brackets. will add brackets)
			 * N1 'Format of values may need structure 
			 * Integer propertie calls:
			 * 0 - do nothing
			 * 1 - brackets 
			 * 2 - '*'
			 * 3 - list table variable(s)
			 * 4 - select table variable(s)
			 * 5 - ALLOW INPUT '
			 */
			
			/**.*/ //restrictors
			/** Master variables .*/
			private String column_indentifier;
			private static Object syntax; 
			
			/**.*/
			/** final enum variables .*/
			private boolean bol_column_adopt; 	
			
			private boolean bol_column_parm_adopt;
			
			private boolean bol_command_input;
			private boolean bol_column_returns;
			
			/**.*/
			/** command variables .*/
			private String str_column_adopt; 
			private String str_column_parm_adopt; 
			private String str_command_input;  //possible local	
			
			private String syntax_correction_process;
			
			private int int_column_returns;
			
			/**
			 * Used to apply commands properly, a small configuration setting. 
			 * @param adopt   
			 * @param KEYWORD
			 */
			
			private databaseCommands(final boolean bol_command_input, final boolean bol_column_parm_adopt, final boolean bol_column_adopt_, final String column_indentifier)
			{
				
				if (column_indentifier != null && !column_indentifier.isEmpty()){
					this.column_indentifier = column_indentifier;
					this.bol_column_adopt = bol_column_adopt_;
					this.bol_column_parm_adopt = bol_column_parm_adopt;
					this.bol_command_input = bol_command_input; }
				else {
					throw new IllegalArgumentException ("undetailed MySql command");
				}
				properties();

			}
			private void properties() {
				
				
			}
			private void display_syntax_process(final String input) {
				System.out.println(input);
				
			}
			
			protected mainipulation data_manipulation_statements()
			{
				return null;
				
			}

			
			//Switch method for 
			
		}





class SELECT_T {
	public void SELECT_T() {

	        System.out.println("SELECT is on ");
	        
	}
	

}

class sql_SELECT implements Command {
	private SELECT_T cmd = new SELECT_T();
	
	public sql_SELECT(SELECT_T cmd) 
	{	
		this.cmd = cmd;
	}
	
	public void execute(){
		cmd.SELECT_T();
	}
	

}

class sql_ALTER_TABLE {
	public static void alter_table_MySql() throws IOException {

        System.out.println("HELLO");
        
	}
	

}

class Switch {
    private Command SELECT;
    
    Switch( Command SELECT) {
    		this.SELECT = SELECT; // concrete Command registers itself with the invoker 
    }
    void flipUp( ) { // invoker calls back concrete Command, which executes the Command on the receiver 
                    SELECT . execute ( ) ;                           
    }
    

    void flipDown( ) {
    		try {
				sql_ALTER_TABLE.alter_table_MySql();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    } 
}


//test class T:1(s)

class MAIN{
	private static databaseCommands dcmd;

	// Command
	public static void main(String[] args) {	
		
		dcmd = databaseCommands.FROM;
		Object c = dcmd.FROM.data_manipulation_statements().SELECT().parameter("b");
		
		//dcmd.FROM.toString();
		
		/*SELECT SELECT = new SELECT();
		sql_SELECT cmd = new sql_SELECT(SELECT);
		
	    Switch sql = new Switch(cmd);
	    sql.flipUp();*/
		
		//sql_ALTER_TABLE Vtech = new sql_ALTER_TABLE();
		//SELECT;

	}
	
}

interface Command {

	public abstract void execute();
	
}
