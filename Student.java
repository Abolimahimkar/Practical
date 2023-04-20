package Array;

public class Student {//
	int studentNo;
	String Name,Mail,Address;
	double fees;
	static double increasendFees;
	StudentArray(int sn,String name,String mail,String address){
		this.studentNo=sn;
		this.Name=name;
		this.Mail=mail;
		this.Address=address;
		
	}
	
   void fees(double f) {
	   fees=f;
   }
   void display() {
	   this.fees=this.fees+increasendFees;
	   System.out.println("Id-" +this.studentNo+" "+"Name-"+this.Name+" "
		 +"Mail-"+this.Mail+" "+"Address-"+this.Address+" "+"Fees-" +fees);
	   static void increasendFees(int n,double f) {
		   if(f<2000) {
			  f=10*f/100;
			  increasendFees=f;
			  
		   }
	   }
	      public static void main(String[]args) {
	    	  StudentArray[] student =new StudentArray{5};
 student[0] =new StudentArray(101,"Aboli","abolimahimkar@gmail.com","Solapur");
 student[1] =new StudentArray(102,"Ashutosh","ashutoshmahimkar@gmail.com","Pune");
 student[2] =new StudentArray(103,"Avinash","avinashghale@gmail.com","Oumarga");
 student[3] =new StudentArray(104,"Ananya","anayamahimkar@gmail.com","Gulbarga");
 student[4] =new StudentArray(101,"Anirudha","animahimkar@gmail.com","Kolapur");
	      
      student[0].fees(1054);
	      }
	    	  
	      }
   }