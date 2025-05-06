package Jobsheet10;
import java.util.Scanner;

public class ExcuseLetterDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    ExcuseLetterStack excuse =  new ExcuseLetterStack(5);
    int pilih;
  do{
    System.out.println("\nMenu:");
    System.out.println("1. Submit Excuse Letter");
    System.out.println("2. Process Excuse Letter");
    System.out.println("3. View Latest Excuse Letter");
    System.out.println("4. Search for Letter");
    System.out.println("Choose: ");
    pilih = sc.nextInt();
    sc.nextLine();
    switch (pilih) {
      case 1:
        System.out.println("ID: ");
        String id = sc.nextLine();
        System.out.println("Name: ");
        String nama = sc.nextLine();
        System.out.println("Class: ");
        String kelas = sc.nextLine();
        System.out.println("Type of Excuse (S/I): (Choose S if you sick or I if it's other personal reason)");
        char type = sc.next().charAt(0);
        System.out.println("Duration: ");
        int duration = sc.nextInt();
        ExcuseLetter08 mhs = new ExcuseLetter08(id, nama, kelas, type, duration);
        excuse.push(mhs);
        System.out.printf("Tugas %s berhasil dikumpulkan\n" , mhs.name);
        break;
      case 2:
      ExcuseLetter08 process = excuse.pop();
      if (process != null){
        System.out.println("Processing " + process.name+  "'s excuse letter" );
      }
      break;
      case 3:
      ExcuseLetter08 view = excuse.peek();
        if (view !=null){
          System.out.println("ID: " + view.id);
          System.out.println("Name: " + view.name);
          System.out.println("Class: " + view.className);
          System.out.println("Type of Excuse: " + view.typeOfExcuse);
          System.out.println("Duration: " + view.duration); 
        }
      break;
      case 4:
      System.out.println("Search a name: ");
      String search = sc.nextLine();
      excuse.findSeqSearch(search);
      break;
     
  }
} while (pilih >= 1 && pilih <=4);
  }
}