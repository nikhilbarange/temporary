package selenium;

public class ErrorAndException {
	public static void addition(int a,int b) {
		System.out.println("welcome to the calculator");
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Enter valid inputs");
			e.printStackTrace();
		}
//		finally {
//			System.out.println("finally block");
//		}
		System.out.println("Thanks for using calculator");
		
	}
	public static void main(String[] args) {
		ErrorAndException.addition(12, 0);
		
		
	}

}
