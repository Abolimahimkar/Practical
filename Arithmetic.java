package Inheritance;

public class Arithmetic {
	public int add(int a,int b) {
		 
		return a+b;
	   }
	} 
       public class Adder extends Arithmetic {
          public static void main(String[] args) {
		Adder adder = new Adder();
		int c=adder.add(5,2);
		System.out.println(c);
	}
       }
