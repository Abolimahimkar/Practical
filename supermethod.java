package Super;

/*Super keyword--referance variable which refer  immediate parent class object 
 * (Iv,method,con)
 * usage of super keyword
 * 1-----refer immedate parent class constructor
 * by using super kryword we can use parent class data member*/

class Shape1{//parent class
	void print() {//parent class method
		System.out.println("print circle");
	}
}
class size1 extends Shape1{//child class
	
	void print() {//child class method
		System.out.println("print triangle");}
		void display() {
		System.out.println("print nothing");}
		
		void show() {
			super.print();
			display();
			print();
			
		}}
public class supermethod {

	public static void main(String[] args) {
		size obj=new size();
		obj.print();
		
	}

}
