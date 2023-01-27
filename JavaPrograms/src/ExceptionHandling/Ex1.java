package ExceptionHandling;

public class Ex1 {
	public static void main(String[] args) {
		int a =10,b=0;
		int c=0;
		try {
			//throw
		 c= a/b;
		}
		catch (Exception e) {
			System.out.println("Error occured");
		}
		
				System.out.println(c);
	}
}
