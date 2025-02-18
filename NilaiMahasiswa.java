import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Jumlah mata kuliah
        int jumlahMK = 8;
        
        // Array untuk menyimpan data
        String[] mataKuliah = new String[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];

        // Input data dari pengguna
        System.out.println("Masukkan data mata kuliah:");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Nama Mata Kuliah: ");
            mataKuliah[i] = scanner.nextLine();

            System.out.print("Nilai Angka: ");
            nilaiAngka[i] = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer

            System.out.print("Nilai Huruf: ");
            nilaiHuruf[i] = scanner.nextLine();

            System.out.print("Bobot Nilai: ");
            bobotNilai[i] = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer
            
            System.out.println();
        }

        scanner.close(); // Menutup scanner

        // Menampilkan tabel
        System.out.println("=================================================");
        System.out.printf("%-40s %-12s %-10s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("=================================================");
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-12.2f %-10s %-10.2f\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        
        System.out.println("=================================================");
    }
}
