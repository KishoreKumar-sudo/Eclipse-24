package ExceptionHandling;

public class Ex2 {
	public static void main(String[] args) {
		int a =10,b=5;
		int c=0;
		try {
		 c= a/b;
		}
		catch (Exception e) {
			System.out.println("Error occured");
		}
		
				System.out.println(c);
	}
}
