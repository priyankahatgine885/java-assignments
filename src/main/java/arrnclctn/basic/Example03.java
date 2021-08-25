package arrnclctn.basic;
import arrnclctn.basic.model.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Employee Ids having Highest Salary in Dept

	public class Application {

  	public static void main(String[] args) {
    	String[] input = {
        "22, Rajan Anand, Engineering, 1600000",
        "23, Swati Patil, Testing, 800000",
        "27, Vijay Chawda, Engineering, 800000",
        "29, Basant Mahapatra, Engineering, 600000",
        "32, Ajay Patel, Testing, 350000",
        "34, Swaraj Birla, Testing, 350000"
    	};
    	//find out which return type here.

    	??? output = processData(input);

    	// print output on stdout
  	}

  	// implement the method.
  	??? processData(input){

  	}
	}

Each input string consists of 4 fields: "Employee ID," "Name," "Department," and "Salary." Here, "Employee   ID" and "Salary" are integers, while "Name" and "Department" are strings that do not contain commas or newlines.You have to find the Employee IDs of the highest paid employee in each department. If your program is run with the input given above, it should produce this output: Engineering: 22
          Testing: 23
This is because Employee ID 22 (Rajan Anand) is the highest paid employee in the Engineering department, and Employee ID 23 (Swati Patil) is the highest paid employee in the Testing department.

 */
public class Example03 {
    public static void main(String[] args) {
        String[] input = {
                "22, Rajan Anand, Engineering, 1600000",
                "23, Swati Patil, Testing, 800000",
                "27, Vijay Chawda, Engineering, 800000",
                "29, Basant Mahapatra, Engineering, 600000",
                "32, Ajay Patel, Testing, 350000",
                "34, Swaraj Birla, Testing, 350000"
        };
        List<Employee> employeeList = prepareList(input);
        Map<String, List<Employee>> employeeMap = processData(employeeList);
        printEmployeeMap(employeeMap);
    }

    public static List<Employee> prepareList(String[] input) {
        List<Employee> list = new ArrayList<>();
        for (String str : input) {
            String[] arrayList = str.split(",", 4);
            Employee employee = new Employee(Integer.parseInt(arrayList[0]), arrayList[1], arrayList[2], Integer.parseInt(arrayList[3].trim()));
            list.add(employee);
        }
        return list;
    }

    public static Map<String, List<Employee>> processData(List<Employee> employeeList) {
        Map<String, List<Employee>> employeeMap = new HashMap<>();
        for (int i = 0; i < employeeList.size(); ++i) {
            Employee employee = employeeList.get(i);
            String empOfDepartment = employee.getDepartment();
            if (employeeMap.containsKey(empOfDepartment)) {
                List<Employee> empList = employeeMap.get(empOfDepartment);
                empList.add(employee);
            } else {
                List<Employee> tempEmployeeList = new ArrayList<>();
                tempEmployeeList.add(employee);
                employeeMap.put(empOfDepartment, tempEmployeeList);
            }
        }
        return employeeMap;
    }

    public static void printEmployeeMap(Map<String, List<Employee>> employeeMap) {
        for (String key : employeeMap.keySet()) {
            List<Employee> employee = employeeMap.get(key);
            System.out.println("Key: " + key + " " + "Value: " + employee);
        }
    }
}
