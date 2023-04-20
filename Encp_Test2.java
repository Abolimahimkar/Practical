package Encapsulation_Eg;
class Student {//encapluation class 
	//private data member
	private int stu_id;
	private String name,email;
	private float fees;
	//public getter & setter method
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	}

public class Encp_Test2 {//class to test the encryption
 public static void main(String args[]) {
	 Student s= new Student();//creating object of setter
	 //setting the value through setter method
	 s.setStu_id(101);
	 s.setName("Aboli");
	 s.setEmail("abolimahimkar@gmail.com");
	 s.setFees(2000f);
 }

	

	}


