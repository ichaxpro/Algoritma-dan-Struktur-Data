import java.util.Scanner;

public class array {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] mataKuliah = {
      "Pancasila",
      "Konsep Teknologi Informasi",
      "Critical Thinking dan Problem Solving",
      "Matematika Dasar",
      "Bahasa Inggris",
      "Dasar Pemrograman",
      "Praktikum Dasar Pemrograman",
      "Keselamatan dan Kesehatan Kerja"
    };

    int jumlahMK = mataKuliah.length;
    double[] nilaiAngka = new double[jumlahMK];
    String[] nilaiHuruf = new String[jumlahMK];
    double[] bobotNilai = new double[jumlahMK];

    System.out.println("===============================================");
    System.out.println("      Program Menghitung IP Semester");
    System.out.println("===============================================");

    for (int i = 0; i < jumlahMK; i++) {
      System.out.print("Masukkan nilai angka untuk MK " + mataKuliah[i] + ": ");
      nilaiAngka[i] = sc.nextDouble();
    }

    // Konversi nilai angka ke nilai huruf dan bobot nilai
    for (int i = 0; i < jumlahMK; i++) {
      if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
        nilaiHuruf[i] = "A";
        bobotNilai[i] = 4.0;
      } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
        nilaiHuruf[i] = "B+";
        bobotNilai[i] = 3.5;
      } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
        nilaiHuruf[i] = "B";
        bobotNilai[i] = 3.0;
      } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
        nilaiHuruf[i] = "C+";
        bobotNilai[i] = 2.5;
      } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
        nilaiHuruf[i] = "C";
        bobotNilai[i] = 2.0;
      } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
        nilaiHuruf[i] = "D";
        bobotNilai[i] = 1.0;
      } else {
        nilaiHuruf[i] = "E";
        bobotNilai[i] = 0.0;
      }
    }

    // Menampilkan hasil dalam bentuk tabel
    System.out.println("======================================================================================");
    System.out.printf("| %-3s | %-40s | %-6s | %-10s | %-5s |\n",
        "No", "Nama Mata Kuliah", "Angka", "Huruf", "Bobot");
    System.out.println("======================================================================================");

    double totalBobot = 0.0;

    for (int i = 0; i < jumlahMK; i++) {
      System.out.printf("| %-3d | %-40s | %6.2f | %-10s | %5.2f |\n",
          (i + 1), mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
      totalBobot += bobotNilai[i];
    }

    System.out.println("======================================================================================");

    // Menghitung IP (Indeks Prestasi)
    double ip = totalBobot / jumlahMK;
    System.out.printf("IP Semester: %.2f%n", ip);

    sc.close();
  }
}
