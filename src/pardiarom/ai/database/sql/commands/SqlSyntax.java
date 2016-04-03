package pardiarom.ai.database.sql.commands;



public class SqlSyntax {


}

class SqlSyntaxCommands extends SqlSyntax
{
	
	abstract class DataMainipulation
	{
		DataMainipulation parameter(String parameter)
		{
			System.out.println(parameter);
			return null;
			
		}
	}
}

class mainipulation implements select
{

	@Override
	public SqlSyntaxCommands.DataMainipulation SELECT() {
		return null;
		// TODO Auto-generated method stub
		
	}



	
}

abstract class subquery 
{

	public subquery()
	{
		
	}
	void meth()
	{
		System.out.println("F");
	}
	
}

interface select 
{

	
	SqlSyntaxCommands.DataMainipulation SELECT();
	
	
} 