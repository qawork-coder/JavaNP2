package day1;

public class MethodWithoutParameters {

	// class block

	public void checkEligibility() {
		int age = 17;

		if (age >= 18) {
			System.out.println("The person is eligible to vote");
		} else {

			System.out.println("The person is not eligible to vote");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// className objName=new className();

		// class object got created with the name obj
		MethodWithoutParameters obj = new MethodWithoutParameters();

		// Creating an object who is having a reference to class MethodWithParamater
		// and we are allocating memory to it

		obj.checkEligibility();// calling of a method

	}

}
