package basic_calculator;

import java.util.Scanner;

class Logic_Of_Calculator {
	Scanner sc=new Scanner(System.in);
	public int[] display() {
		System.out.println("Enter the no of Elements");
		int size =sc.nextInt();
		System.out.println("--------------------------");
		int[] numbers =new int[size];
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Enter the number"+ (i+1));
			int nos =sc.nextInt();
			numbers[i]=nos;
		}
		return numbers;
	}
	public void addition(int[] numbers) {
		int sum =0;
		for(int i =0; i<numbers.length;i++) {
			sum = sum + numbers[i];
		}
		System.out.println("----------------");
		System.out.println("Addition :"+ sum);
		System.out.println("----------------");
	}
	public void subtraction(int[] numbers) {
		int sub =numbers[0];
		for(int i=1 ; i<numbers.length;i++) {
			sub = sub - numbers[i];
		}
		System.out.println("-------------------");
		System.out.println("Subtraction:" + sub);
		System.out.println("-------------------");
	}
	public void multiplication(int[]numbers) {
		int mul =numbers[0];
		for(int i=1; i<numbers.length; i++) {
			mul= mul* numbers[i];
		}
		System.out.println("-----------------------");
		System.out.println("Multiplication :" + mul);
		System.out.println("-----------------------");
	}
	public void division(int[]numbers) {
		int div =numbers[0];
		for (int i =1; i<numbers.length;i++) {
			if(numbers[i]!=0) {
			div = div /numbers[i];
			System.out.println("--------------");
			System.out.println("Divion:" + div);
			System.out.println("--------------");
		}
			else {
				System.err.println("Number cannot be divided by 0!");
			    break;
			}
		}
	}
	
	public void modulus(int[] numbers) {
		int mod =numbers[0];
		for (int i=1; i<numbers.length;i++) {
			if(numbers[i]!=0) {
				mod = mod% numbers[i];
				System.out.println("-----------------");
				System.out.println("Modulus:" + mod);
				System.out.println("-----------------");
			}
			else {
				System.out.println("Number cannot be divided by 0");
				break;
			}
		}
			
		}
		
	
	}