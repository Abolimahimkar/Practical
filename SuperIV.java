package Super;
/*Super keyword--referance variable which refer  immediate parent class object 
 * (Iv,method,con)
 * usage of super keyword
 * 1-----refer immedate parent class constructor
 * by using super kryword we can use parent class data member*/

class Shape{//parent class
	String name="circle";//data member of parent class
}
class size extends Shape{//child class
	String name="no size";//data member of child class
	void print() {//child class method
		System.out.println(name);//it represent child class
		//it represent immidiate parent class IV
		System.out.println(super.name);
		
	}
	
}
 

public class SuperIV {

	public static void main(String[] args) {
	size obj=new size();
	obj.print();
	
	}

}
