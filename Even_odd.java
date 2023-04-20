package Array;
import java.util.Arrays;

public class Even_odd {

	public static void main(String[] args) {
		int[]array_nums= {3,5,7,8,9,1};
		System.out.println("original Array:"+Arrays.toString(array_nums));
		int a=0;
		for(int i=0;i<array_nums.length;i++)
		{
			if(array_nums[i]%2==0)
				a++;
			
		}
		System.out.println("Even number:"+a);
		System.out.println("odd number:"+(array_nums.length-a));
	}

}
