package vtPlus;
import java.util.Scanner;

public class vt_input {
	public static void main(String[] args) {
		System.out.println("Take User Input from the user");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		System.out.println("Enter number 2");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println("The sum of these numbers is");
		System.out.println(sum);
		System.out.println("Enter your name");
	//String str = sc.next();
         String str = sc.nextLine();
	System.out.println(str);
		
	}
	
}