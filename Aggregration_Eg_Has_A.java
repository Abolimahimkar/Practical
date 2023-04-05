package Inheritance;

public class Aggregration_Eg_Has_A {

	public static void main(String args[]) {
		
	
	Address a= new Address("Solapur","Maharashtra","India");
	Student s=new Student(01,"Aboli",a);
	s.show();
	
	}
}
	