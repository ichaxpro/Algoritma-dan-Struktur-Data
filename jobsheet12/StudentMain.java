package Jobsheet12;

import java.util.Scanner;

public class StudentMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    StudentQueue queue = new StudentQueue();
    int choice;
    do{
      System.out.println("\n=== Acadeic Service Menu ===");
      System.out.println("1. Enqueue Student");
      System.out.println("2. Calling Student to the Queue");
      System.out.println("3. Display Front");
      System.out.println("4. Queue Size");
      System.out.println("5. Display Rear Data");
      System.out.println("0. Exit");
      System.out.print("Choose Menu: ");
      choice = sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1:
          System.out.println("NIM: ");
          String nim = sc.nextLine();
          System.out.println("Name: ");
          String name = sc.nextLine();
          System.out.println("Class: ");
          String className = sc.nextLine();
          System.out.println("Major: ");
          String major = sc.nextLine();
          
          Student std = new Student(nim, name, className, major);
          queue.enqueue(std);
          break;
        case 2:
        Student studentBeingServed = queue.dequeue();
        if (studentBeingServed != null){
          System.out.println("Student being served: ");
          studentBeingServed.print();
        }
        break;
        case 3:
        queue.peekFront().print();
        break;
        case 4:
        System.out.println("Queue size: "+ queue.size);
        break;
        case 5:
        queue.peekRear().print();
        break;
        case 0:
        System.out.println("Thanks!!");
        break;
        default:
          System.out.println("Invalid Menu!!");
      }
    }while(choice != 0);
  }
}
