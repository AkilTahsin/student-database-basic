import java.io.*;
import java.util.*;

public class StudentDatabase{
  public static void main(String [] args) throws Exception{
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to student database.");
    
    while(true){
      System.out.println("\nPress '1' to input new data. Press '2' to search for data. Press '3' to delete a data. Press '4' to terminate the program");     
      int userChoice = sc.nextInt(); sc.nextLine();
      
      if(userChoice == 1){
        System.out.print("Input new student data\nID: ");
        String outputID = sc.nextLine();
        
        File f = new File(outputID+".txt");
        int exist = 0;
        if(f.exists()){
          System.err.println("Student info already exists. Press '0' to overwrite data.");
          exist = sc.nextInt(); sc.nextLine();
        }
        if(exist==0){
          Person p1 = new Person();
          p1.setDetails(outputID);
          ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(f));
          out.writeObject(p1);
          System.out.println("Data entry successful");
          out.close();
        }
      }
      else if(userChoice == 2){
        System.out.println("Input student ID");
        String inputID = sc.nextLine();
        try{
          ObjectInputStream in = new ObjectInputStream(new FileInputStream(inputID+".txt"));
          Person p2 = (Person)in.readObject();
          p2.printInfo();
          in.close();
        }
        catch(FileNotFoundException e){
          System.err.println("Student info does not exist");
        }
      }
      else if(userChoice == 4)
        break;
      else if(userChoice == 3){
        System.out.println("Input student ID");
        String inputID = sc.nextLine();
        try{
          File f = new File(inputID+".txt");
          ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
          in.close();
          f.delete();
          System.out.println("Data deletion successful");
        }
        catch(FileNotFoundException e){
          System.err.println("Student info does not exist");
        }
      }
    }
  }
}