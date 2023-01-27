package ExceptionHandling;

public class Ex3 {
	public static void main(String[] args) {
		int a =10,b=0;
		int c=0;
		try {
			int arr[] = null;
			//System.out.println("arr[1]");
		 c= a/b;
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
		
				System.out.println(c);
	}
}
