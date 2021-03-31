package day2;

public class MethodOverridingChild extends MethodOverridingBase{

	public void printName()
	{
		System.out.println("This is the child class");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverridingChild obj=new MethodOverridingChild();
		obj.printName();//Current class method will get a priority over here
	}

}
