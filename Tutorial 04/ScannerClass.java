import java.util.Scanner;

public class ScannerClass{

	public static void main(String[] args){
	
		String userInput = null;
		Scanner scanner1 = new Scanner(System.in);

		System.out.println("Enter something you want to print");
		
		userInput = scanner1.next();

		System.out.println(userInput);
	}
}