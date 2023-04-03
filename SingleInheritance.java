package Inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		SIChild Child = new SIChild();
		Child.display();
		Child.show();
	}
}
     class SIparent{
    	 void show() {
    		 System.out.println("Show the details of parent class");
    	 }
     }
     class SIChild extends SIparent {
    	 void display() {
    		 System.out.println("Display the result of child class");
    	 }
     }

	

	