package Array;
import java.util.Arrays;

public class Remove_Array {

	public static void main(String[] args) {
		int[] my_array= {2,4,5,6,7,3,6,9,8,7,6,5,8,0};
		int Index_position=2;
		int newValue=5;
	System.out.println("original Array:"+Arrays.toString(my_array));
	for(int i=my_array.length-1;i>Index_position;i--) {
		my_array[i]=my_array[i-1];
	
	}
        my_array[Index_position]=newValue;
 System.out.println("After removing the second element::"+" "+Arrays.toString(my_array));
 
	}
	
		
}
