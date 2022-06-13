import java.io.*;
import java.util.*;

public class Person implements Serializable{
  transient Scanner sc = new Scanner(System.in);
  
  private String name;
  private int age;
  private String department;
  private Date birthday;
  private String id;
  private String address;
  
  Person(){
    name = "N/A";
    age = 0;
    department = "N/A";
    birthday = new Date();
    id = "N/A";
    address = "N/A";
  }
  
  void setDetails(){
    System.out.print("Name: "); name = sc.nextLine();
    System.out.print("Age: "); age = sc.nextInt(); sc.nextLine();
    System.out.print("Department: "); department = sc.nextLine().toUpperCase();
    System.out.print("Birth Date: "); int date = sc.nextInt(); sc.nextLine();
    System.out.print("Birth Month: "); int month = sc.nextInt(); sc.nextLine();
    birthday = new Date(date, month);
//    System.out.print("Birth Year (Enter blank if no input): "); int year = sc.nextInt(); sc.nextLine();
    System.out.print("ID: "); id = sc.nextLine(); if(id.length() != 8) throw new IllegalArgumentException("Invalid ID.");
    System.out.print("Address: "); address = sc.nextLine();
  }
  
    void setDetails(String _id){
    System.out.print("Name: "); name = sc.nextLine();
    System.out.print("Age: "); age = sc.nextInt(); sc.nextLine();
    System.out.print("Department: "); department = sc.nextLine().toUpperCase();
    System.out.print("Birth Date: "); int date = sc.nextInt(); sc.nextLine();
    System.out.print("Birth Month: "); int month = sc.nextInt(); sc.nextLine();
    birthday = new Date(date, month);
//    System.out.print("Birth Year (Enter blank if no input): "); int year = sc.nextInt(); sc.nextLine();
    id = _id; if(id.length() != 8) throw new IllegalArgumentException("Invalid ID.");
    System.out.print("Address: "); address = sc.nextLine();
  }
  
  public void printInfo(){
  System.out.println
          ("      Name: "+name+
         "\n        ID: "+id+
         "\nDepartment: "+department+
         "\n       Age: "+age+
         "\n  Birthday: "+birthday+
         "\n    Adress: "+address);
  }
}