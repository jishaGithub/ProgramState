import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {


        Employee employee1 = new Employee(1, "Sam", 23, "sam@gmail.com", 13.5);
        Employee.addEmployeeToList(employee1);
        Employee employee2 = new Employee(2, "Sid", 30, "sid@gmail.com", 15.5);
        Employee.addEmployeeToList(employee2);

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter the file name with extension that you want to save the program state");
        String fileName = scan1.nextLine();
        EmployeeUtils.saveEmployeeState(Employee.getEmployeeList(), fileName);
        System.out.println("Do you want to load the program state now? Enter YES/NO : ");
        String response = scan1.nextLine().toUpperCase();
        if (response.equals("YES")) {
            System.out.println("Enter the file name that you want to load the program state : ");
            fileName = scan1.nextLine();
            EmployeeUtils.loadEmployeeState(fileName);
        } else {
            System.out.println("Exiting");
        }
    }
}

