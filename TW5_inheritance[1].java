/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw4employees;
//Design and implement a Java program to demonstrate the concept of inheritance using an Employee base class and two specialized subclasses: FullTime and PartTime. The Employee class should store common employee attributes such as age, name, address, and gender. The FullTime class should extend Employee and include additional details such as salary and designation, while the PartTime class should also extend Employee and maintain information on working hours and hourly rate. The program should create objects of both subclasses, compute the salary for part-time employees based on hours worked and rate per hour, and display complete details for each employee by overriding the display method.

import java.util.Scanner;
/**
 *
 * @author KSMathad
 */
class Employee
{
    int age;
    String name, address, gender;
    Scanner get = new Scanner(System.in);
    Employee()
    {
        System.out.println("Enter Name of the Employee:");
        name = get.nextLine();
        System.out.println("Enter Gender of the Employee:");
        gender = get.nextLine();
        System.out.println("Enter Address of the Employee:");
        address = get.nextLine();
        System.out.println("Enter Age:");
        age = Integer.parseInt(get.nextLine());;
    }

    void display()
    {
        System.out.println("Employee Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
    }
}

class FullTime extends Employee
{
    float salary;
    String des;

    FullTime()
    {
        System.out.println("Enter Designation:");
        des = get.nextLine();
        System.out.println("Enter Salary:");
        salary = Float.valueOf(get.nextLine()).floatValue();
    }
    void display()
    {
        System.out.println("================================");
        System.out.println("Full Time Employee Details");
        System.out.println("================================");
        super.display();
        System.out.println("Salary: Rs."+salary);
        System.out.println("Designation: "+des);
    }
}

class PartTime extends Employee
{
    int workinghrs, rate;
    PartTime()
    {
        System.out.println("Enter Number of Working Hours:");
        workinghrs = Integer.parseInt(get.nextLine());
    }
    void calculatepay()
    {
        rate = 200 * workinghrs;
    }

    void display()
    {
        System.out.println("==============================");
        System.out.println("Part Time Employee Details");
        System.out.println("==============================");
        super.display();
        calculatepay();
        System.out.println("Number of Working Hours: "+workinghrs);
        System.out.println("Salary for "+workinghrs+" working hours is: Rs."+rate);
    }
}

class TW5Employees
{
    public static void main(String args[]) 
    {
        System.out.println("================================");
        System.out.println("Enter Full Time Employee Details");
        System.out.println("================================");
        FullTime full = new FullTime();
        System.out.println("================================");
        System.out.println("Enter Part Time Employee Details");
        System.out.println("================================");
        PartTime part = new PartTime();
        full.display();
        part.display();
    }
}
