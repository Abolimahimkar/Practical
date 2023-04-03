package Inheritance;

  class Opertaing_System{
	  void Boost() {
		  System.out.println("Boosting mode on");
	  }
  }
     class windows extends Opertaing_System{
    	 void run() {
    		 System.out.println("run mode on");
    	 }
     }
        class Linux extends Opertaing_System {
        	void storage_capasity() {
        		System.out.println("storage_capasity is very high");
        	}
        }
     public class Hierarchicalin {

	public static void main(String[] args) {
		Linux b= new Linux();
		b.Boost();
		b.storage_capasity();
		windows c=new windows();
		c.run();
		c.Boost();
	}

}
