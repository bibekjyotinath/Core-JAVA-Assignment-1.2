import java.util.Scanner;		//including the scanner method to take input from user

public class Addition {

	public static void main(String[] args) {
		
		int num1, num2, carry;
		
		Scanner sc = new Scanner(System.in);     //object created of Scanner class
		
		System.out.println("Enter 1st number: ");	//insertion of 1st number
		num1 = sc.nextInt();
		System.out.println("Enter 2nd number: ");	//insertion of 2nd number
		num2 = sc.nextInt();
		sc.close();             //closing the scanner class
		
		while(num2!=0)
		{
			carry = num1 & num2; 	//bitwise AND 
			num1 = num1 ^ num2;		//bitwise XOR
			num2 = carry << 1;		//bitwise left shift
		}
		System.out.println("The sum is: "+num1);
	}
}