package sem3hwtask2;

/*
Компаратор и компарируемость (Comparator и Comparable):

Создайте класс Employee с полями name, age и salary.
Реализуйте интерфейс Comparable<Employee> для сравнения сотрудников по их возрасту.
Создайте компаратор EmployeeSalaryComparator, который будет сравнивать сотрудников по их зарплате.
Напишите тестовый класс для проверки сортировки массива сотрудников с использованием 
как Comparable, так и Comparator. */

public class Employee1 {

    private String name;
    private int age;
    private int salary;

    public Employee1(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    
    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public String toString(){
        return "Employee{"+"name='"+name+'\''+",age="+age+'\''+",salary="+salary+'}';
    }

    
}
