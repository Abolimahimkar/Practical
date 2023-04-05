package Inheritance;

public class Employee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	Long employeePhone;
	double basicSalary;
	double specialAllowance =160.70;
	double hra = 1100.15 ;
	public Employee(long Id, String Name, String Address, Long Phone) {
		this.employeeId = Id;
		this.employeeName = Name;
		this.employeeAddress = Address;
		this.employeePhone = Phone;
	} 
 void calculateSalary() {
		  
		double salary = basicSalary +(basicSalary* specialAllowance/100)+(basicSalary*hra/100);
		   System.out.println("Salary: "+ salary);
	   }
}
	class Manager extends Employee{
		public Manager(long Id,String Name,String Address,Long Phone,double Salary) {
			super(Id,Name,Address,Phone);
			this.basicSalary=Salary;
		}
	}
	 class InheritanceActivity
	 {
		 public static void main(String args[]) 
		 {
			 Manager manager = new Manager(12,"Rohan","India",7654321L,45000);
			 manager.calculateSalary();
		 }
		 
		 
		 
		 
		 
	 }
		
	
	