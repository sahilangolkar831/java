/*
 * Write a Java program to demonstrate the use of a user-defined package. 
Create a package containing a Studentdetails class with a parameterized constructor and 
a method to display student information. In another Java file, import the package, 
read student details using Scanner, create an object of the package class, and display the student details.
 */
package expt7ise;
import expt7ise.Studentdetails.Studentdetails;

import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author KSMathad
 */
public class Expt7ISE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nm;
          int roll;
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Roll no:= ");
          roll = sc.nextInt();
          System.out.print("Enter Name:= ");
          nm = sc.next();
          int m1,m2,m3;
          System.out.print("Enter 3 subs mark:= ");
          m1 = sc.nextInt();
          m2 = sc.nextInt();
          m3 = sc.nextInt();
          Studentdetails s = new Studentdetails( roll,nm,m1,m2,m3);
          s.display();
    }
    
}
