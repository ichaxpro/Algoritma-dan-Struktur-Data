import java.util.Scanner;

public class selection {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nilaiAkhir = 0;
    System.out.println("Program Menghitung Nilai Akhir");
    System.out.println("===============================");
    System.out.print("Masukkan Nilai Tugas: ");
    int assignment = sc.nextInt();
    System.out.print("Masukkan Nilai Kuis: ");
    int quiz = sc.nextInt();
    System.out.print("Masukkan Nilai UTS: ");
    int midterm = sc.nextInt();
    System.out.print("Masukkan Nilai UAS: ");
    int finalExam = sc.nextInt();

    System.out.println("=====================================");
    System.out.println("=====================================");
    if ((assignment <= 0 || assignment >= 100) || (quiz <= 0 || quiz >= 100) || (midterm <= 0 || midterm >= 100)
        || (finalExam <= 0 || finalExam >= 100)) {
      System.out.println("nilai tidak valid");
      System.out.println("=====================================");
      System.out.println("=====================================");
    } else {
      nilaiAkhir = (0.2 * assignment) + (0.2 * quiz) + (0.3 * midterm) + (0.3 * finalExam);
      System.out.println("Nilai Akhir: " + nilaiAkhir);

      if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
        System.out.println("Nilai Huruf: A");
      } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
        System.out.println("Nilai Huruf: B+");
      } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
        System.out.println("Nilai Huruf: B");
      } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
        System.out.println("Nilai Huruf: C+");
      } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
        System.out.println("Nilai Huruf: C");
      } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
        System.out.println("Nilai Huruf: D");
      } else if (nilaiAkhir <= 39) {
        System.out.println("Nilai Huruf: E");
      }

      System.out.println("=====================================");
      System.out.println("=====================================");
      if (nilaiAkhir >= 0 && nilaiAkhir <= 60) {
        System.out.println("MAAF ANDA TIDAK LULUS");
      } else {
        System.out.println("SELAMAT ANDA LULUS");
      }
    }
      sc.close();
  }

}
