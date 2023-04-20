package Array;
//to get the class name of array object in java
public class ClassNameArray {

	public static void main(String[] args) {
		//declearation & initialization of an array 
		int arr[]= {1,2,3};
		//print the class name
		Class a=arr.getClass();
		String name=a.getName();
		System.out.println(a);

	}

}
