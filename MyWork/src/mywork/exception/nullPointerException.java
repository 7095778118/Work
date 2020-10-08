package mywork.exception;

public class nullPointerException {

	public static void main(String args[])
	{
		try
		{
			String str=null;
			System.out.println(str.length());
		}
		catch(Exception e)
		{
			System.out.println("Null Pointer exception occured");
		}
		
		}
	}




