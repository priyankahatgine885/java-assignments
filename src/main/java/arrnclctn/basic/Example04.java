package arrnclctn.basic;
import arrnclctn.basic.model.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
create following map from employee list and print both maps
Map<Integer, Employee>
	Key: 22, Value: {22, Rajan Anand, Engineering, 1600000}
	Key: 23, Value: {23, Swati Patil, Testing, 800000}
	Key: 27, Value: {27, Vijay Chawda, Engineering, 800000}
	Key: 29, Value: {29, Basant Mahapatra, Engineering, 600000}
	Key: 32, Value: {32, Ajay Patel, Testing, 350000}
	Key: 34, Value: {34, Swaraj Birla, Testing, 350000}
 */
public class Example04 {
    public static void main(String[] args) {
        String[] input = {
                "22, Rajan Anand, Engineering, 1600000",
                "23, Swati Patil, Testing, 800000",
                "27, Vijay Chawda, Engineering, 800000",
                "29, Basant Mahapatra, Engineering, 600000",
                "32, Ajay Patel, Testing, 350000",
                "34, Swaraj Birla, Testing, 350000"
        };
        List<Employee> employees = prepareList(input);
        Map<Integer, Employee> employeeMap = processData(employees);
        printMap(employeeMap);
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

    public static Map<Integer, Employee> processData(List<Employee> employeeList) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        for (Employee employee : employeeList) {
            employeeMap.put(employee.getId(), employee);
        }
        return employeeMap;
    }

    public static void printMap(Map<Integer, Employee> employeeMap) {
        for (Integer id : employeeMap.keySet()) {
            Employee employees = employeeMap.get(id);
            System.out.println("Key: " + id + " " + "Value: " + employees);
        }
    }
}
