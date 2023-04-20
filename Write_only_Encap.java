package Encapsulation_Eg;

public class Write_only_Encap {
	private String name;
	public void setName(String name) {
		this.name=name;
	}

	public static void main(String[] args) {
		 Write_only_Encap obj=new  Write_only_Encap();
		 System.out.println(obj.name);
	}

}
