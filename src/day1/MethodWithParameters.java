package day1;

import java.util.Scanner;

public class MethodWithParameters {

	public void checkEligibility1(int age)
	{
		

		if (age >= 18) {
			System.out.println("The person is eligible to vote");
		} else {

			System.out.println("The person is not eligible to vote");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithParameters obj=new MethodWithParameters();
		
		Scanner scan=new Scanner(System.in);//Scanner class helps in taking input from the user
		System.out.println("Please enter your age");
		int val=scan.nextInt();
		
		obj.checkEligibility1(val);
	}

}
