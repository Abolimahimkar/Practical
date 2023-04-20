           //Assignment//

package Array;

public class Duplicate_Array_Element {

	public static void main(String[] args) {
		int[]arr=new int[] {1,2,3,4,4,3,2,5,6};
		System.out.println("Duplicate element in given");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
			}
		}

	}

}
