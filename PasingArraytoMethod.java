package Array;

public class PasingArraytoMethod {
	static void maximumNo(int array[]) {
		int max=array[0];
		for(int i=1;i<array.length;i++)
			if(max<array[i])
				max=array[i];
		System.out.println(max);
	}
	static void minimumNo(int array[]) {
		int min=array[0];
		for(int i=1;i<array.length;i++)
			if(min>array[i])
				min=array[i];
		System.out.println(min);
	}

	public static void main(String[] args) {
		int a[]= {5,7,9,10,12};
		minimumNo(a);
		maximumNo(a);
		
	}

}
