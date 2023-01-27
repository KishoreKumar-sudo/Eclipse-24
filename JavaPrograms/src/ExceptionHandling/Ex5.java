package ExceptionHandling;

public class Ex5 {
	public static void main(String[] args) {
		int a =10,b=2;
		int c=0;
		try {
			int arr[] = null;
			//System.out.println("arr[1]");
		 c= a/b;
		 System.out.println("Try block");
		}
		
		catch (ArithmeticException e) 
		{
System.out.println("Arithmetic Exception has occured");		
}
		catch (NullPointerException e) {
			System.out.println(" NullPointer Exception has occured");		

		}
		catch (Exception e) {
			System.err.println("Error occured");
		}
		finally {
			System.out.println("This gets printed whatever the situation is.!!!");
		}
		
		
				System.out.println(c);
	}
}
