package design;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		

EmployeeInfo emp1 = new EmployeeInfo("Lisa",3745);
EmployeeInfo emp2 = new EmployeeInfo("Bob", 4444);
emp1.assignDepartment("IT");
emp1.assignDepartment("HR");

emp1.setSalary(7000);
emp1.calculateSalary(emp1.getSalary());
emp2.setSalary(5500);
emp2.calculateSalary(emp2.getSalary());

String vision = "DO YOUR BEST";
		emp1.describeCompany();
		emp1.describeCompany(vision);

		emp1.setPerformance(3);
		double bonus1 = (emp1.calculateEmployeeBonus(emp1.getSalary(), (int) emp1.getPerformance()));
		emp2.setPerformance(2);
		double bonus2 = (emp2.calculateEmployeeBonus(emp2.getSalary(), (int) emp2.getPerformance()));





	}

}
