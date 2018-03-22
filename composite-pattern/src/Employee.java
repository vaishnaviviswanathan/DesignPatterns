import java.util.ArrayList;
import java.util.List;

public class Employee {

    String name;
    String position;
    List<Employee> employeeList;

    public Employee(String name, String position){
        this.name=name;
        this.position=position;
        this.employeeList = new ArrayList<>();
    }

    public void add(Employee employee){
        employeeList.add(employee);
    }

    public void remove(Employee employee){
        employeeList.remove(employee);
    }

    public List<Employee> getSubordinates(){
        return employeeList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }

}
