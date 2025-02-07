package employee_pkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EMSService {
	private List<Employee> employees = new ArrayList<>();
	
	public Employee findEmployee(int id) throws EmployeeNotFoundException{
		return employees.stream()
				.filter(emp -> emp.getEmployeeId() == id)
				.findFirst().orElseThrow(() -> new EmployeeNotFoundException("Employee not found."));
	}
	
	public void addEmployee(Scanner scanner) {
		System.out.print("Enter First Name: ");
		String firstName = scanner.nextLine();
		System.out.print("Enter Last Name: ");
		String lastName = scanner.nextLine();
		System.out.print("Enter Employee ID: ");
		int id = scanner.nextInt();
		System.out.print("Enter Salary: ");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		
		Employee emp = new Employee(id, firstName, lastName, "2025-02-06", salary, null);
		employees.add(emp);
		System.out.println("Employee added successfully!");
	}
	
	public void updateEmployee(Scanner scanner) {
		System.out.print("Enter Employee ID to update: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		for (Employee emp : employees) {
			if (emp.getEmployeeId() == id) {
				System.out.print("Enter new salary: ");
				double salary = scanner.nextDouble();
				emp.setSalary(salary);
				System.out.println("Updated successfully!");
				return;
			}
		}
		System.out.println("Employee not found!");
	}
	
	public void removeEmployee(Scanner scanner) {
		System.out.print("Enter Employee ID to remove: ");
		int id = scanner.nextInt();
		employees.removeIf(emp -> emp.getEmployeeId() == id);
		System.out.println("Employee removed successfully!");
	}
	
	public void listEmployees() {
		if (employees.isEmpty()) {
			System.out.println("No employees found.");
		}
		else {
			employees.forEach(System.out::println);
		}
	}
}
