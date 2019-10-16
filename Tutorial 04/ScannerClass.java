import java.util.Scanner;

public class ScannerClass{

	public static void main(String[] args){
	
		String userInput = null;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter something you want to print");
		
		userInput = sc.next();

		System.out.println(userInput + " was what you wanted to be printed. ");
	}
}