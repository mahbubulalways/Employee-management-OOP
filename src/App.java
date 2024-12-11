
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        int select;
        String name;
        int id;
        double monthlySalary;
        int hoursWorked;
        double hourlyRate;

        PayRollSystem payRollSystem = new PayRollSystem();
        Scanner input = new Scanner(System.in);
        Scanner namScanner = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            System.out.println("To add full time employee press 1: ");
            System.out.println("To add part time employee press 2: ");
            System.out.println("To see all employees press 3: ");
            System.out.println("To exit the process press 4: ");
            System.out.print("Press: ");

            select = input.nextInt();
            if (select == 1) {
                System.out.println("Add full time employee. Enter details");
                String employee_type = "Full time";
                System.out.print("Employee name: ");
                name = namScanner.nextLine();
                System.out.print("Enter employee id: ");
                id = input.nextInt();
                System.out.print("Enter employee monthly salary: ");
                monthlySalary = input.nextDouble();
                FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name, id, monthlySalary, employee_type);
                System.out.println("New full time employee added successfully. Here is details");
                payRollSystem.addNewEmployee(fullTimeEmployee);
                System.out.println(fullTimeEmployee.toString());;
            }
            // * PART TIME
            if (select == 2) {
                System.out.println("Add part time employee. Enter details");
                String employee_type = "Part time";
                System.out.print("Employee name: ");
                name = namScanner.nextLine();
                System.out.print("Enter employee id: ");
                id = input.nextInt();
                System.out.print("Enter employee's daily working hours: ");
                hoursWorked = input.nextInt();
                System.out.print("Enter employee's working rate: ");
                hourlyRate = input.nextDouble();
                PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name, id, hoursWorked, hourlyRate, employee_type);
                System.out.println("New part time employee added successfully. Here is details");
                payRollSystem.addNewEmployee(partTimeEmployee);
                System.out.println(partTimeEmployee.toString());
            }
            if (select == 3) {
                System.out.println();
                payRollSystem.employeeList();
                System.out.println();
            }
            if (select == 4) {
                condition = false;
            }
        }
        System.out.println("Process Exit Successfully.");
    }

}
