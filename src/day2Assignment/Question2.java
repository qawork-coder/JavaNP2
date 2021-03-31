package day2Assignment;

public class Question2 {

	public void Subtraction(int a, int b) {
		System.out.println("Method with 2 param");
	}

	public void Subtraction(int a) {
		System.out.println("Method with 1 param");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Question2 obj=new Question2();
		obj.Subtraction(10);
		obj.Subtraction(10, 20);
	}

}
