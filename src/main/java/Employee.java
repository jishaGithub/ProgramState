import java.io.Serializable;
import java.util.ArrayList;

public class Employee {

    private static ArrayList<Employee> employeeList = new ArrayList<>();
    private int id;
    private String name;
    private int age;
    private String email;
    private double hourlyWage;
    public Employee(int id, String name, int age, String email, double hourlyWage ){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.hourlyWage = hourlyWage;
    }
    public static void addEmployeeToList(Employee employee){

        employeeList.add(employee);
    }


    public String toString(){
        return this.id+" : "+this.name+" : "+this.age+" : "+this.email+" : "+this.hourlyWage;
    }
    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public double getHourlyWage() {

        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public static ArrayList getEmployeeList() {

        return employeeList;
    }


}
