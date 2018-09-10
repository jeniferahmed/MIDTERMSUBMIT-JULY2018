package design;

import java.util.Scanner;

public class EmployeeInfo extends EmployeeDetailsABS {

	/*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
	 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
	 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
	 * go to FortuneEmployee class to apply all the fields and attributes.
	 *
	 * Important: YOU MUST USE the
	 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
	 * Use all kind of keywords(super,this,static,final........)
	 * Implement Nested class.
	 * Use Exception Handling.
	 *
	 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	static private int employeeId;
	private String employeeName;
	private String departmentName;
	private static double Salary;
	private static double performance;

	/*
	 * You must implement the logic for below 2 methods and
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	//CONSTRUCTORS
	public EmployeeInfo(int employeeId) {
		this.employeeId = employeeId;
	}

	public EmployeeInfo(String employeeName, int employeeId) {
		this.employeeName = employeeName;
		this.employeeId = employeeId;
	}
	//METHODS

	public static double calculateEmployeeBonus(double Salary, int performance) {
		double yearlyBonus = 0;
		if (performance == 5) {
			yearlyBonus = Salary * 0.1 * 12;
		} else if (performance == 4) {
			yearlyBonus = Salary * 0.08 * 12;
		} else if (performance == 3) {
			yearlyBonus = Salary * 0.06 * 12;
		} else if (performance == 2) {
			yearlyBonus = 0;
			System.out.println("POOR PERFORMANCE,NEED ROOM FOR IMPROVEMENT.");
		} else {
			yearlyBonus = 0;
			System.out.println("Fired.");
		}
		int total = 0;
		System.out.println("Total Bonus = " + total);
		return total;
	}


	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on.
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 *
	 */


	public static double calculateEmployeePension() {
		//use scanner class
		double total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
		String convertedJoiningDate = DateConversion.convertDate(joiningDate);
		String convertedTodaysDate = DateConversion.convertDate(todaysDate);
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);

		//implement numbers of year from above two dates
		//Calculate pension
		int numberOfYears = current - start;

		if (numberOfYears >= 5) {
			total = Salary * .25;
		} else if (numberOfYears == 4) {
			total = Salary * .20;
		} else if (numberOfYears == 3) {
			total = Salary * 0.15;
		} else if (numberOfYears == 2) {
			total = Salary * .10;
		} else if (numberOfYears == 1) {
			total = Salary * 0.5;
		} else if (numberOfYears == 0) {
			total = 0;
		}
		System.out.println("Total pension: $" + total);
		return total;


	}

	//Methods
	public void EmployeeInfo(String employeeName, int employeeId) {
		this.employeeName();
		this.employeeId = employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int employeeId() {
		return employeeId;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String employeeName() {
		return employeeName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}

	public double getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public void assignDepartment(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void describeCompany() {
		companyName = "SELENIUM LTD.";
		System.out.println("The company name is " + companyName);
	}

	public void describeCompany(String vision) {
		System.out.println(vision);

	}

	public double calculateSalary(double Salary) {
		double yearlySalary = Salary * 12;
		return yearlySalary;
	}


	public void benefitLayout() {
		System.out.println("You will get 10 Vacation days.");
	}


	public void assignDepartment() {

	}


	public int calculateSalary() {
		return 0;
	}


	private static class DateConversion {

		public DateConversion(Months months) {
		}

		public static String convertDate(String date) {
			String[] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}

