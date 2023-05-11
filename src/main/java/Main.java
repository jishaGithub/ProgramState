import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Employee employee1 = new Employee(1,"Sam",23,"sam@gmail.com",13.5);
        Employee.addEmployeeToList(employee1);
        Employee employee2 = new Employee(2,"Sid",30,"sid@gmail.com",15.5);
        Employee.addEmployeeToList(employee2);

        EmployeeUtils.saveEmployeeState(Employee.getEmployeeList(),"employee1.txt");
        EmployeeUtils.loadEmployeeState("employee1.txt");
    }
}
