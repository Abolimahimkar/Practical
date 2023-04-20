package Array;

public class CopyArray {
//class

	public static void main(String[] args) {
		//declaring a destination array
		char[]copyFrom= {'A','V','I','N','S','H'};
		char[]copyTo=new char[7];
		System.arraycopy(copyFrom, 4, copyTo, 3, 2);
		System.out.println(String.valueOf(copyTo));
	}

}
