package arrnclctn.basic;
import arrnclctn.basic.model.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
create following map from employee list and print both maps
Map<String, List<Employee>>

	Key: Engineering, Value: [
                            { 22, Rajan Anand, Engineering, 1600000 },
                            { 27, Vijay Chawda, Engineering, 800000 },
                            { 29, Basant Mahapatra, Engineering, 600000 }
      ]
	Key: Testing, Value: [
                            { 23, Swati Patil, Testing, 800000 },
                            { 32, Ajay Patel, Testing, 350000 },
                            { 34, Swaraj Birla, Testing, 350000 }
		]

 */
public class Example05 {
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
