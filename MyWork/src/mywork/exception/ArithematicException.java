package mywork.exception;
public class ArithematicException {
	public static void main(String[] args) {
		{
			try {
				int a = 5 / 0;
			} catch (Exception e)

			{
				System.out.println("ArthematicException " + e);
			}
		}
	}

}
