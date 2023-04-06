package Assigenment;
import java.util.Scanner;
class Parent
{
	void show (int p)
	{ 
		System.out.println("The valu of p:"+p+" ");
	}
	void print(int q) {
		System.out.println("The valu of q:"+q+" ");
	}
}
    class New_Child extends Parent
    { 
    	@Override
    	void show  (int p)
    	{
    		System.out.println("The valu of p:"+p+" ");
    	}


    	@Override
    	void print (int q)
    	{
    		System.out.println("The valu of s(Square):"+q*q+" ");
    		
    	}
    	}
    	
public class Que3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t=sc.nextInt();
	while(t>0)
	{
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		int s=sc.nextInt();
		Parent obj2=new Parent();
		obj2.show(p);
		obj2.print(s);
	}
	}
}
		
	

	


