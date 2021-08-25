package arrnclctn.basic;

import arrnclctn.basic.model.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
declare array of integers, array of strings, array of employees.
declare list of integers, list of strings, list of employees.
declare set of integers, set of strings, set of employees.
Write a method printCollection to print all elements given collection
 */
public class Example01 {
    public static void main(String[] args) {
        int[] arrayOfInt = new int[2];
        String[] arrayOfString = new String[2];
        Employee[] employees = new Employee[2];

        List<Integer> integerList = new ArrayList<>(); // declare list of Integer
        integerList.add(10);
        integerList.add(20);
        printCollection(integerList);

        List<String> stringList = new ArrayList<>();

        List<Employee> employeeList = new ArrayList<>();

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        printCollection(integerSet);

        Set<String> stringSet = new HashSet<>();
        Set<Employee> employeeSet = new HashSet<>();
    }
    private static void printCollection(Iterable<Integer> iterable){
        for (Integer itr: iterable) {
            System.out.println(itr);
        }
    }
}
