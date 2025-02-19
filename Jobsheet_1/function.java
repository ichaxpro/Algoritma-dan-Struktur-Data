public class function {
  static String[] jenisBunga = { "Algonema", "Keladi", "Alocasia", "Mawar" };

  public static void main(String[] args) {
    
    int[][] stokBunga = {
        { 10, 5, 15, 7 }, // RoyalGarden 1
        { 6, 11, 9, 12 }, // RoyalGarden 2
        { 2, 10, 10, 5 }, // RoyalGarden 3
        { 5, 7, 12, 9 } // RoyalGarden 4
    };

    int[] hargaBunga = { 75000, 50000, 60000, 10000 };
    
    int[] penguranganStok = { 1, 2, 0, 5 };
    System.out.println("=============================");
    System.out.println("ROYAL GARDEN");
    System.out.println("=============================");
    int[] pendapatanSemuaCabang = pendapatanHarga(stokBunga, hargaBunga); 

    for (int i = 0; i < pendapatanSemuaCabang.length; i++) {
      System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp" + pendapatanSemuaCabang[i]);
    }
    System.out.println("=============================");
    System.out.println("UPDATE STOK ROYAL GARDEN 4");
    updateStok(stokBunga, 3, penguranganStok); 
    
  }

  static int[] pendapatanHarga(int[][] stok, int[] harga) {
    int[] pendapatan = new int[stok.length];
    for (int i = 0; i < stok.length; i++) {
      int total = 0;
      for (int j = 0; j < stok[i].length; j++) {
        total += stok[i][j] * harga[j];
      }
      pendapatan[i] = total;
    }
    return pendapatan;
  }

  static void updateStok(int[][] stok, int cabangKe, int[] pengurangan) {
    for (int i = 0; i < pengurangan.length; i++) {
      stok[cabangKe][i] -= pengurangan[i]; 
      System.out.println(jenisBunga[i] + ": " + stok[cabangKe][i] + " units");
    }
  }
}
