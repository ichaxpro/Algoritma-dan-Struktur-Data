package week7;
import java.util.Scanner;

public class studentMain {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    Scanner sl = new Scanner (System.in);

    searchStudent data = new searchStudent();
    int amountStudent = 5;

    System.out.println("------------------------------");
    System.out.println("Input student data accoridngly from smallest NIM");
    for (int i =0; i < amountStudent; i++){
      System.out.println("-------------------");
      System.out.print("NIM\t:");
      int nim = s.nextInt();
      System.out.print("Name\t:");
      String name = sl.nextLine();
      System.out.print("Age\t:");
      int age = s.nextInt();
      System.out.print("GPA\t:");
      double gpa = s.nextDouble();

      student08 std = new student08(nim, age, name, gpa);
      data.add(std);
    }
      System.out.println("-----------------------------");
      System.out.println("Entire Student Data");
      data.display();

      System.out.println("------------------------");
      System.out.println("------------------------");
      System.out.println("Search student by NIM: ");
      int search = s.nextInt();
      System.out.println("Using sequential Search");
      int position = data.findSeqSearch(search);

      data.showPosition(search, position);
      data.showData(search, position);

    
      System.out.println("========================");
      System.out.println("Search student by NIM: ");
      System.out.println("Using binary Search");
      int position1 = data.findBinarySearch(search, 0, amountStudent-1);

      data.showPosition(search, position);
      data.showData(search, position);
    }
  }

