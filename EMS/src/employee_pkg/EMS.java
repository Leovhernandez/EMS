package employee_pkg;
import java.util.Scanner;


public class EMS {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EMSService service = new EMSService();
		
		while(true) {
			System.out.println("Employee Management System");
			System.out.println("1. Add Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Remove Employee");
			System.out.println("4. List Employees");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 1:
				service.addEmployee(scanner);
				break;
			case 2:
				service.updateEmployee(scanner);
				break;
			case 3:
				service.removeEmployee(scanner);
			case 4:
				service.listEmployees();
				break;
			case 5:
				System.out.println("Exiting...");
				return;
				default:
					System.out.println("Invalid choice, try again.");
			}
		}
	}

}
