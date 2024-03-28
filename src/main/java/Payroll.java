package Assignments;
import java.util.ArrayList;
import java.util.List;

public class Payroll {
	public List<Employee> employees;
	
	 Payroll() {
		 employees = new ArrayList<>();
	}
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public void calculateSalary(double hoursWorked) {
		for(int i = 0; i < employees.size(); i++) {
			Employee employee = employees.get(i);
			
			double pay = employee.getHourlyRate() * hoursWorked;
			System.out.print("Pay for: " + employee.getEmployeeName() + " pay: " + pay);
		}
	}
	
	public static void main(String args[]) {
	    // Create instances of Employee and Payroll classes
        Employee employee = new Employee("Christian", 40, 1234, 300.0);
        Payroll payroll = new Payroll();
        
        // Add employee to payroll
        payroll.addEmployee(employee);
        
        // Calculate salary
        payroll.calculateSalary(40); // Assuming 40 hours worked
        
        
	}
}
