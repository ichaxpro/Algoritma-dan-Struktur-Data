package week7;

import java.util.Scanner;

public class LecturerDemo {
  public static void main(String[] args) {
    LecturerData08 data = new LecturerData08();
    Scanner s = new Scanner(System.in);

    // Adding lecturers
    data.add(new lecturer08("L001", "Alice Johnson", false, 45));
    data.add(new lecturer08("L002", "Bob Smith", true, 40));
    data.add(new lecturer08("L003", "John Anderson", true, 44));
    data.add(new lecturer08("L005", "Roxana Agriche", false, 44));

    // Printing all lecturers
    System.out.println("Original Data");
    data.print();
    System.out.println();
    data.sortingASC();
    System.out.println("Sort lecturers by age from youngest to oldest using Bubble Sort");
    data.print();
    System.out.println();
    data.sortingDSC();
    System.out.println("Sort lecturers by age from oldest to youngest using Selection Sort ");
    data.print();

    // Search for a lecturer by age
    System.out.println("Search lecturer by age: ");
    int search = s.nextInt(); 

   
    System.out.println("Using Sequential Search");
    data.findSeqSearch(search); 

    System.out.println("========================");

  
    System.out.println("Using Binary Search");
    data.findBinarySearch(search, 0, data.idx - 1); 
  }
}
