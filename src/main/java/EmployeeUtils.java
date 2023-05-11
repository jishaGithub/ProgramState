import org.apache.commons.io.FileUtils;

import java.io.File;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

public class EmployeeUtils {
    public static void saveEmployeeState(ArrayList employeeList, String fileName) throws Exception {
        String stateOfObject = StringUtils.join(employeeList, "\n");
        File file1 = new File(fileName);
        if(file1.exists()) {
            System.out.println(fileName+" file already exists.We are going to overwrite that file.");
        }
        else{
            System.out.println("File doesn't exist. We are creating a new file called "+fileName);
            for (int i = 0; i < Employee.getEmployeeList().size(); i++) {
                FileUtils.writeStringToFile(file1, stateOfObject);
            }
        }
    }

    public static void loadEmployeeState(String fileName) throws Exception {
        File file2 = new File(fileName);
        if(file2.exists()) {
            System.out.println("File exists! Loading the file....");
            String loadState = FileUtils.readFileToString(file2);
            String[] employeeArray = StringUtils.split(loadState, "\n");
            ArrayList<Employee> employeeLoadedArrayList = new ArrayList<>();
            for (String strEmployee : employeeArray) {
                int i = 1;
                String[] values = StringUtils.split(strEmployee, " : ");
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                int age = Integer.parseInt(values[2]);
                String email = values[3];
                Double hourlyWage = Double.valueOf(values[4]);
                employeeLoadedArrayList.add(new Employee(id, name, age, email, hourlyWage));
            }
            for (int i = 0; i < employeeLoadedArrayList.size(); i++) {
                System.out.println(employeeLoadedArrayList.get(i));
            }
        }
        else{
            System.out.println("File doesn't exist. First save a file state.");
        }
    }
}
