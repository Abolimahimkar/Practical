package Inheritance;

public class Student {
 int sudId;
 String SudName;
 Address add;
 Student(int sudId,String SudName, Address add)
 {
	 this.add=add;
	 this.SudName=SudName;
	 this.sudId=sudId;
 }
    void show() {
      System.out.println(sudId+" "+SudName);
    System.out.println(add.city+" "+add.Dist+" "+add.Country);
}
 }