package basic_calculator;

import java.util.Scanner;

public class Basic_Calculator {

	public static void main(String[] args) {
		System.out.println("Welcome to Basic calculator system");
		System.out.println("==================================");
		Scanner sc = new Scanner(System.in);
		Logic_Of_Calculator logic = new Logic_Of_Calculator();
		while(true) {
		System.out.println("Please make a choice:\n1.Add\n2.Sub\n3.Multiply\n4.Divide\n5.Mod\n6.Exit");
		int choice =sc.nextInt();
		
		switch(choice) {
		case 1:
			int[] numbers=logic.display();
			logic.addition(numbers);
			break;
		case 2:
			numbers =logic.display();
			logic.subtraction(numbers);
			break;
		case 3:
			numbers =logic.display();
			logic.multiplication(numbers);
			break;
		case 4:
			numbers =logic.display();
			logic.division(numbers);
			break;
		case 5 :
			numbers =logic.display();
			logic.modulus(numbers);
			break;
		case 6:
			break;
	    default:
	    	System.out.println("Invalid choice");
	    	break;
		}
		if(choice==6) {
			System.out.println("Thank you!");
			break;
		}
	}
}
}