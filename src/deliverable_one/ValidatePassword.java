package deliverable_one;
import java.util.Scanner;


public class ValidatePassword {
	
	public static void main(String[] args) {
		final int NUM_UP = 1;
		final int NUM_LOW = 1;
		
		int hasLow = 0;
		int hasUp = 0;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your password: ");
		String password = in.nextLine();
		int passwordLength = password.length();
		
		for (int i = 0; i < passwordLength; i++) {
			char c = password.charAt(i);
			if (Character.isUpperCase(c))
				hasUp++;
			else if (Character.isLowerCase(c))
				hasLow++;
			
		}
		
		if(hasUp >= NUM_UP && hasLow >= NUM_LOW && password.length() >=7 && password.length() <= 12 && password.contains("!"))
			System.out.println("Password valid and accepted");
		else {
			System.out.println("Error");
		}
	}
}