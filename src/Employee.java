
public class Employee {
	
	int employeeNumber;
	String employeeName;
	
	public Employee(int employeeNumber, String employeeName) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
	}
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + "]";
	}
	
	

}
