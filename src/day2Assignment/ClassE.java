package day2Assignment;

public class ClassE extends ClassD{

	public void method5()
	{
		System.out.println("Class E");
	}
	public static void main(String args[])
	{
		ClassE obj=new ClassE();
		obj.method1();//Whenever we use object , we can call the methods from all classes
		
	}
}
