package Assigenment;
class Father{
	void shoot() {
		System.out.println("I am in Father! I am a right-handed shooter!");
		
	}
}
class child extends Father{
	void shoot() {
		System.out.println("I am the son!I am a left-handed shooter!");
	}
} 

    public class MethodOverriddingRL {
    	public static void main(String args[]) {
    		Father f=new  Father();
    		f.shoot();
    		Father fc = new child();
    		fc.shoot();
    		
    	}

}
