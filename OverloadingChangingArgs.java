package Assigenment;

public class OverloadingChangingArgs {
	static int sum(int a, int b) {
		return a+b;
		
	}
	 static int sum(int x,int y,int z) {
	 return x+y+z;
	 }

	public static void main(String[] args) {
		System.out.println(OverloadingChangingArgs.sum(7,3));
		System.out.println(OverloadingChangingArgs.sum(4,9,7));

	}

}
