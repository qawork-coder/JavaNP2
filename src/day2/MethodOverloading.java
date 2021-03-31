package day2;

public class MethodOverloading {

	public void sum(int val1, double val2) {
		System.out.println("Sum =" + (val1 + val2));
		
	}
	
	public void sum(double val1, double val2) {
		System.out.println("Sum =" + (val1 + val2));
		
	}
	
	public void sum(int val1, int val2) {
		System.out.println("Sum =" + (val1 + val2));
		
	}
	
	public void sum() {
		System.out.println("Sum =");
		
	}
	
	public void sum(int a) {
		System.out.println("Sum =");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading obj=new MethodOverloading();
		obj.sum(10.1, 20.2);
		
		
	}

}
