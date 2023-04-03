package Inheritance;

public class Parents_Simple_Eg_Is_A {

	int marks = 85;
}
    class Simple_Eg_Is_A extends Parents_Simple_Eg_Is_A {
    	
    	int Additional_percentage = 5;
    	public static void main(String args[]) {
    		Simple_Eg_Is_A obj = new Simple_Eg_Is_A();
    		System.out.println("Total marks:"+(obj.Additional_percentage));
    		
    	}
 

}
