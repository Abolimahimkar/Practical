package Assigenment;

public class Test_overridding {
void run() {
	System.out.println("running mode on");
}
}
class overridding extends  Test_overridding{
	void run() {
		System.out.println("running mode off");
	}
	public static void main(String[] args) {
		 overridding a=new overridding();
		 a.run();
		 

	}

}
