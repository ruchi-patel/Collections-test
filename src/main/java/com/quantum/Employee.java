package com.quantum;

import java.util.Comparator;
import java.util.Date;

/**17.Write a class named Employee with fields name,age,salary,joiningDate
 * Write comparable to compare with age
 * and Write comparators for all other fields*/

public class Employee implements Comparable<Employee> {

    private String name;
    private int age;
    private int salary;
    private Date joiningDate;

    public Employee(String name, int age, int salary, Date joiningDate) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }


    @Override
    public int compareTo(Employee o) {
        return this.age - o.age;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", salary=" + salary +
            ", joiningDate=" + joiningDate +
            '}';
    }
}
