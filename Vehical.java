package Inheritance;

public class Vehical {
	void running() {
		System.out.println("running mode on");
	}
}
    class car extends Vehical{
    	void run() {
    		System.out.println("car run mode on");
    	}
    }
    class I10 extends car {
    	void speed() {
    		System.out.println("speed is very high");
    	}
    }
       public class Multilevelin {
      
         public static void main(String[] args) {
        	 I10 d =new I10();
        	 d.running();
        	 d.run();
        	 d.speed();
		
	}

}



