package week06;
import java.util.Scanner;

public class studentDemo08 {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("How many students do you want to input? ");
    int input = sc.nextInt();
    sc.nextLine(); // Membersihkan buffer

    topStudent08 topStudents = new topStudent08(input);

    for (int i = 0; i < input; i++) {
        System.out.println("\nEnter data for Student " + (i + 1) + ":");
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Class: ");
        String studentClass = sc.nextLine();
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine(); 

        student08 student = new student08(nim, name, studentClass, gpa);
        topStudents.add(student); 
    }

    
    
    // // Adding student data
    // topStudents.add(new student08("2201", "Alice", "A", 3.9));
    // topStudents.add(new student08("2202", "Bob", "B", 3.7));
    // topStudents.add(new student08("2203", "Charlie", "C", 3.8));
    // topStudents.add(new student08("2204", "David", "D", 3.6));
    // topStudents.add(new student08("2205", "Eve", "E", 4.0));

    // Display original list
    System.out.println("Original student list:");
    topStudents.print();
    // Sorting students by GPA using Bubble Sort
    topStudents.bubbleSort();
    System.out.println("Sorted student list (by GPA, descending):");
    topStudents.print();

    topStudents.selectionSort();
    System.out.println("Sorted Student List (by GPA, ascending) using Selection Sort: ");
    topStudents.print();

    topStudents.insertionSort();
    System.out.println("Sorted student list (by GPA, ascending) using Insertion Sort: ");
    topStudents.print();
  }
}
