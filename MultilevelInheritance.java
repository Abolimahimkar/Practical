package Inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
				SIChild2 Child = new SIChild2();
				Child.display();
				Child.show();
				Child.print();
	            }
		     }
		     class SIparent1{
		    	 void show() {
		    		 System.out.println("Show the details of parent class");
		    	 }
		     }
		     class SIChild1 extends SIparent1 {
		    	 void display() {
		    		 System.out.println("Display the result of child class 1");
		    	 }
		     }
		     class SIChild2 extends SIChild1 {
		    	 void print() {
		    		 System.out.println("Print the output of child class 2");
		    	 }
		     }
