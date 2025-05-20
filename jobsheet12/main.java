package Jobsheet12;

import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SingleLinkedList sll = new SingleLinkedList();
    // Student08 std1 = new Student08("001", "Student 1", "TI-1I", 3.89);
    // Student08 std2 = new Student08("002", "Student 2", "TI-1I", 3.45);
    // Student08 std3 = new Student08("003", "Student 3", "TI-1I", 3.20);
    // Student08 std4 = new Student08("004", "Student 4", "TI-1I", 3.00);

    System.out.println("Masukkan data 4 mahasiswa:");
    System.out.println();

    System.out.println("Mahasiswa 1:");
    System.out.print("NIM: ");
    String nim1 = sc.nextLine();
    System.out.print("Name: ");
    String name1 = sc.nextLine();
    System.out.print("Class Name: ");
    String className1 = sc.nextLine();
    System.out.print("GPA: ");
    double gpa1 = sc.nextDouble();
    sc.nextLine(); // membersihkan newline
    Student08 std1 = new Student08(nim1, name1, className1, gpa1);

    System.out.println();
    System.out.println("Mahasiswa 2:");
    System.out.print("NIM: ");
    String nim2 = sc.nextLine();
    System.out.print("Name: ");
    String name2 = sc.nextLine();
    System.out.print("Class Name: ");
    String className2 = sc.nextLine();
    System.out.print("GPA: ");
    double gpa2 = sc.nextDouble();
    sc.nextLine();
    Student08 std2 = new Student08(nim2, name2, className2, gpa2);

    System.out.println();
    System.out.println("Mahasiswa 3:");
    System.out.print("NIM: ");
    String nim3 = sc.nextLine();
    System.out.print("Name: ");
    String name3 = sc.nextLine();
    System.out.print("Class Name: ");
    String className3 = sc.nextLine();
    System.out.print("GPA: ");
    double gpa3 = sc.nextDouble();
    sc.nextLine();
    Student08 std3 = new Student08(nim3, name3, className3, gpa3);

    System.out.println();
    System.out.println("Mahasiswa 4:");
    System.out.print("NIM: ");
    String nim4 = sc.nextLine();
    System.out.print("Name: ");
    String name4 = sc.nextLine();
    System.out.print("Class Name: ");
    String className4 = sc.nextLine();
    System.out.print("GPA: ");
    double gpa4 = sc.nextDouble();
    sc.nextLine();
    Student08 std4 = new Student08(nim4, name4, className4, gpa4);

    sll.print();
    sll.addFirst(std1);
    sll.print();
    sll.addLast(std4);
    sll.print();
    sll.insertAfter(std3, name4);
    sll.insertAt(2, std2);
    sll.print();

    System.out.println("Data at index 1 is: ");
    Student08 data = sll.getData(1);
    data.print();
    int idx = sll.indexOf(name1);
    System.out.println("Student 1 is located at index: " +idx);

    sll.removeFirst();
    sll.removeLast();
    sll.print();
    sll.removeAt(0);
    sll.print();
  }
}
