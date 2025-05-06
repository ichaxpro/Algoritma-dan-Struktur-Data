package Jobsheet10;

import java.util.Scanner;

public class StudentDemo08 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    StudentAssignmentStack08 stack =  new StudentAssignmentStack08(5);
    int pilih;
    do{
    System.out.println("\nMenu:");
    System.out.println("1. Mengumpulkan Tugas");
    System.out.println("2. Menilai Tugas");
    System.out.println("3. Melihat tugas teratas");
    System.out.println("4. Melihat daftar tugas");
    System.out.println("5. First Submitted Name");
    System.out.println("6. Melihat jumlah tugas");
    System.out.println("Pilih: ");
    pilih = scan.nextInt();
    scan.nextLine();
    switch (pilih) {
      case 1:
        System.out.println("Nama: ");
        String nama = scan.nextLine();
        System.out.println("NIM: ");
        String nim = scan.nextLine();
        System.out.println("Kelas: ");
        String kelas = scan.nextLine();
        Student08 mhs = new Student08(nim, nama, kelas);
        stack.push(mhs);
        System.out.printf("Tugas %s berhasil dikumpulkan\n" , mhs.name);
        break;
        case 2:
        Student08 dinilai = stack.pop();
        if (dinilai !=null){
          System.out.println("Menilai tugas dari " + dinilai.name);
          System.out.println("Masukkan nilai (0-100): ");
          int nilai = scan.nextInt();
          dinilai.grading(nilai);
          System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.name, nilai);
          String binary = stack.convertToBinary(nilai);
          System.out.printf("Assignment grade in binary is %s\n", binary);
        }
        break;
        case 3:
        Student08 lihat = stack.peek();
        if (lihat !=null){
          System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.name);
        }
        break;
        case 4:
        System.out.println("Daftar semua tugas");
        System.out.println("Nama\tNIM\tKelas");
        stack.print();
        break;
        case 5:
        Student08 first = stack.firstSubmitted();
        if(first !=null){
          System.out.println("Tugas pertama dikumpulkan oleh " + first.name);
        }
        break;
        case 6:
        System.out.println("Jumlah tugas yang dikumpulkan " + stack.count());
        break;
      default:
      System.out.println("Pilihan tidak valid");
        break;
    }
  }while (pilih >= 1 && pilih <=6);
  }
  
}
