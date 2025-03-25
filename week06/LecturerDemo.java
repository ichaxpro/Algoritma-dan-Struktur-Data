package week06;

public class LecturerDemo {
  public static void main(String[] args) {
    LecturerData08 data = new LecturerData08();

        // Adding lecturers
        data.add(new lecturer08("L001", "Alice Johnson", false, 45));
        data.add(new lecturer08("L002", "Bob Smith", true, 40));

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
        
  }
}
