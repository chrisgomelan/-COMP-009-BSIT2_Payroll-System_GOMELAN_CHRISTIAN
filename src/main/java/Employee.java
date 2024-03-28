package Assignments;

public class Employee {
		String employeeName;
		int employeeId, hoursWorked;
		double hourlyRate;
		
		Employee(String employeeName, int hoursWorked, int employeeId, double hourlyRate){
			this.employeeName = employeeName;
			this.employeeId = employeeId;
			this.hourlyRate = hourlyRate;
			this.hoursWorked = hoursWorked;
		}
		
		public String getEmployeeName() {
			return employeeName;
		}
		public int getEmployeeId() {
			return employeeId;
		}
		public double getHourlyRate() {
			return hourlyRate;
		}
		public void setHourlyRate(double hourlyRate) {
	        this.hourlyRate = hourlyRate;
	    }
		public int hoursWorked() {
			return hoursWorked;
		}
	

}
