package sem3hwtask2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import task3.MyLinkedList;
import java.util.List;

public class Main 
{

    public static void main(String[] args) 
    {
        List<Employee> people=new ArrayList<>();
        List<Employee1> people1=new ArrayList<>();


        people.add(new Employee("Alice", 25,40000));
        people.add(new Employee("Bob", 30,5000));
        people.add(new Employee("Charlie", 20,200000));

        people1.add(new Employee1("Beavis", 25,400));
        people1.add(new Employee1("Butthead", 30,5));
        people1.add(new Employee1("JohnDoe", 20,25));

        System.out.println("List before sorting:");
        for (Employee person : people) {
            System.out.println(person);
        }

        for (Employee1 person : people1) {
            System.out.println(person);
        }



        Collections.sort(people);
        Collections.sort(people1, new EmployeeSalaryComparator());

        System.out.println("\n");

        System.out.println("List after sorting by age (using comparable):");
        for (Employee person : people) {
            System.out.println(person);
        }
        
        
        System.out.println("List after sorting by salary (using comparator class):");
        for (Employee1 person : people1) {
            System.out.println(person);
        }



    }
    
    
}
