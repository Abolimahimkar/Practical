package Array;
import java.util.Scanner;

public class UsingScannerclass {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter array lenght:");
		int arrLenght=s.nextInt();
		int []anArray=new int[arrLenght];
		System.out.println("Enter the element:");
		for(int i=0;i<arrLenght;i++)
			anArray[i]=s.nextInt();
		System.out.println("Display the array list :");
		for(int i=0;i<arrLenght;i++)
		{
			System.out.println(anArray[i]+" ");
		}

	}

}
