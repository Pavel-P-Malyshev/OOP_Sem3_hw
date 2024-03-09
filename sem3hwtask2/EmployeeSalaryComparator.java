package sem3hwtask2;

import java.util.Comparator;

/*
Компаратор и компарируемость (Comparator и Comparable):

Создайте класс Employee с полями name, age и salary.
Реализуйте интерфейс Comparable<Employee> для сравнения сотрудников по их возрасту.
Создайте компаратор EmployeeSalaryComparator, который будет сравнивать сотрудников по их зарплате.
Напишите тестовый класс для проверки сортировки массива сотрудников с использованием 
как Comparable, так и Comparator. */

public class EmployeeSalaryComparator implements Comparator<Employee1>{

    @Override
    public int compare(Employee1 emp1, Employee1 emp2){
        return Integer.compare(emp1.getSalary(), emp2.getSalary());
    }
}
    

