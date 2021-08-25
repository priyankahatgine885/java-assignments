package arrnclctn.basic;

import arrnclctn.basic.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Average marks scored across all subjects by the student with the lowest ID. The input is in this format:
     22, Data Structures, 45
     23, English, 52
     22, English, 51
     26, Data Structures, 72
     23, Data Structures, 61
     24, English, 81

Each line consists of three fields: "Student ID," "Subject," and "Marks." "Student ID" and "Marks" are integers and "Subject" is a string that does not contain commas or newlines. There can be any number of students and up to 6 subjects.
You have to modify processData to compute the average marks scored across all subjects by the student with the lowest ID.
public class Application{
public static void main(String []args){
string[] input = {
			"22, Data Structures, 45",
		"23, English, 52",
			"22, English, 51",
		"26, Data Structures, 72",
			"23, Data Structures, 61",
		"24, English, 81"
};
      Iterable<Student> students = prepareData(input);
      	??? output = ??? processData(students);
      // print the output.
}

// implement the method.
private static Iterable<Student> prepareData(String[] lines) {
}
// implement the method.
private static ??? processData(Iterable <Student> students) {
}
}

 */
public class Example02 {
    public static void main(String[] args) {
        String[] input = {
                "22, Data Structures, 45",
                "23, English, 52",
                "22, English, 51",
                "26, Data Structures, 72",
                "23, Data Structures, 61",
                "24, English, 81"
        };
        Iterable<Student> students = prepareData(input);
        Map<Integer, Integer> studentMap = processData(students);
        printStudentMap(studentMap);
    }

    private static Iterable<Student> prepareData(String[] input) {
        List<Student> students = new ArrayList<>();
        for (String str : input) {
            String[] arrayList = str.split(",");
            Student student = new Student(Integer.parseInt(arrayList[0]), arrayList[1], Integer.parseInt(arrayList[2].trim()));
            students.add(student);
        }
        return students;
    }

    private static Map<Integer, Integer> processData(Iterable<Student> students) {
        Map<Integer, Integer> studentMap = new HashMap<>();
        int lowestId = Integer.MAX_VALUE;
        int averageMark = 0;
        int sum = 0;
        int count = 0;
        for (Student student : students) {
            int id = student.getId();
            if (id <= lowestId) {
                lowestId = id;
                if (id == lowestId) {
                    sum += student.getMark();
                    ++count;
                }
            }
        }
        averageMark = sum / count;
        studentMap.put(lowestId, averageMark);
        return studentMap;
    }

    public static void printStudentMap(Map<Integer, Integer> studentMap) {
        for (Map.Entry<Integer, Integer> entry : studentMap.entrySet()) {
            Integer key = entry.getKey();
            Integer students = entry.getValue();
            System.out.println("Key: " + key + " " + "Value: " + students);
        }
    }
}
