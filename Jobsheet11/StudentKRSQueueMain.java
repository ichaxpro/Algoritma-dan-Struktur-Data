package Jobsheet11;

import java.util.Scanner;

public class StudentKRSQueueMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    StudentKRSQueue queue = new StudentKRSQueue(10);
    int choice;
    do{
      System.out.println("\n=== Acadeic Service Menu ===");
      System.out.println("1. Add Student");
      System.out.println("2. Process 2 Students (KRS Approval)");
      System.out.println("3. Show All Student");
      System.out.println("4. Show the first Two Students");
      System.out.println("5. Show the Last Student");
      System.out.println("6. Show the Total Number of Students");
      System.out.println("7. Show number of students who have completed the KRS approval process");
      System.out.println("8. Display the number of students who have not yet completed the KRS approval process.");
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
          System.out.println("Study Program: ");
          String studyProgram = sc.nextLine();
          System.out.println("Class: ");
          String className = sc.nextLine();
          StudentKRS std = new StudentKRS(nim, name, studyProgram, className);
          queue.enqueue(std);
          break;
        case 2:
//         System.out.println("Processing 2 students from the queue:");
// for (int i = 0; i < 2; i++) {
//     if (!queue.isEmpty()) {  // Check if the queue is not empty before dequeuing
//         StudentKRS studentBeingServed = queue.dequeue();
//         System.out.println("Student being served (" + (i + 1) + "):");
//         studentBeingServed.print();
//     } else {
//         System.out.println("Queue is empty. Only " + i + " student(s) processed.");

// Process 2 students (1st approval session)
        
        queue.dequeue2();

        // Process 2 more students (2nd approval session)
        
        break;  // Exit loop if the queue is empty
        case 3:
        queue.print();
        break;
        case 4:
        queue.peek2();
        break;
        case 5:
        queue.viewRear();
        break;
        case 6:
        System.out.println("Queue size: "+ queue.size);
        break;
        case 7:
        queue.printApprovedCount();
        break;
        case 8:
        queue.printRemainingStudent();
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
