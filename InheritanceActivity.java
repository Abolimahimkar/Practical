package Assigenment;

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager m = new Manager(126534,"Peter","Chenni,India",237844,65000);
		double managerSal=m.calculateSalary();
		System.out.println("Manager Salary ="+managerSal);
		double managerTA=m.calculateTransportAllowance();
		System.out.println("Manager Transport Allowance ="+managerTA);
		System.out.println("Updated Salary of Manager ="+managerSal+managerTA);
		
		Trainee t = new Trainee(29846,"Jack","Mumbai India",442085,45000);
		double traineeSal=t.calculateSalary();
		System.out.println("\nTrainee Salary ="+traineeSal);
		double traineeTA=m.calculateTransportAllowance();
		System.out.println("Trainee Transport Allowance ="+traineeTA);
		System.out.println("Updated Salary of Trainee ="+traineeSal+traineeTA);
		
	}

}
