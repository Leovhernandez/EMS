package employee_pkg;

public class Department {
	private int departmentId;
	private String name;
	private String phoneNumber;
	private double budget;
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getBudget() {
		return budget;
	}
	public void setBudget(double budget) {
		this.budget = budget;
	}
	public Department(int departmentId, String name, String phoneNumber, double budget) {
		super();
		this.departmentId = departmentId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.budget = budget;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", budget=" + budget + "]";
	}
	

}
