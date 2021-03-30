import java.util.Scanner;

public class CircularPrime {
   
	public static void main(String[] args) {
			// Create scanner
		try (Scanner input = new Scanner(System.in)) {
			//prompt user
			System.out.print("Enter Integer: ");
			int value = input.nextInt();
			
			
		if(isCircularPrime(value)) {
			System.out.println(value + " is a circular prime number.");
		} else {
			System.out.println(value + " is not a circular prime number.");
			}
		}
	}
	
	static boolean isCircularPrime(int value) {
		int[]num = getRotations(value);
		// loop up to the number of digits
		for (int i = 0;i<num.length;i++ ) {
			// checking if the integer is prime
			if (!isPrime(num[i])) {
				
			return false;
			}
		}	
		return true;
	}
	
	static int[] getRotations(int n) {
		// convert integer into string
		String str = String.valueOf(n);
		int[] r = new int[str.length()];
			// looping through possible combinations
			for(int i =0; i < str.length();i++) {
				
				r[i] = Integer.parseInt(str);
				char first = str.charAt(0);
				str = str.substring(1);
				str += first;
			}
		return r;
	}	

public static boolean isPrime(int n) {

	boolean isNotPrime=false;

	for (int i = 2; i <= n/i; i++) { 
		if (n % i == 0) { // if a number is even number%2 will return 0
			isNotPrime = true; // if a number is odd it will return 1
			break;    
		}
	}
	return !isNotPrime; // number is prime
	}

}
