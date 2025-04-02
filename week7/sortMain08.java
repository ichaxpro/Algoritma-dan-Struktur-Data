package week7;

public class sortMain08 {
  public static void main(String[] args) {
    int[] r = {10, 40, 30, 50, 70, 20, 100, 50};
    mergeSort sorting = new mergeSort();
    System.out.println("Sorting with merge sort");
    System.out.println("Initial Data");
    sorting.printArray(r);

    sorting.mergeSort(r); // Menjalankan merge sort

    System.out.println("Sorted Data");
    sorting.printArray(r);
}
}
