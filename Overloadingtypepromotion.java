package Assigenment;

public class Overloadingtypepromotion {
	void add(int a,double b) {
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Overloadingtypepromotion obj=new Overloadingtypepromotion ();
		obj.add(5,8);
		obj.add(10,15,6);
		
		
	}

}
