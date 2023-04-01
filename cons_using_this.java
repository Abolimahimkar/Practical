package constructor;

public class cons_using_this {
	int age;
	String name;
	cons_using_this(int age , String name){
		this.age=age;
		this.name=name;
	}
	void show() {
		System.out.println(age+" "+name);
	}
	public static void main(String[] args) {
		cons_using_this d=new  cons_using_this(50,"Zoha");
		cons_using_this d1=new cons_using_this(50,"Arsh");
		cons_using_this d2=new  cons_using_this(50,"Manaal");
		d.show();
		d1.show();
		d2.show();
	}

}
