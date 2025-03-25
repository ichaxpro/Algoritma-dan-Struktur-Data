package week06;

public class sortingMain08 {
  public static void main(String[] args) {
  int a[] = {34, 7, 23, 32, 5, 62};
  int b[] = {30, 20, 2, 8, 14};
  int c[] = {40, 10, 4, 9, 3};
  sorting08 sorting = new sorting08(a);
  System.out.println("Original Array: ");
  sorting.print();
  sorting.bubbleSort();
  System.out.println("Sorted array (Bubble Sort): ");
  sorting.print();
  sorting08 sorting2 = new sorting08(b);
  System.out.println("Original Array: ");
  sorting2.print();
  sorting2.selectionSort();
  System.out.println("Sorted array (Selection Sort): ");
  sorting2.print();
  sorting08 sorting3 = new sorting08(c);
  System.out.println("Original Array: ");
  sorting3.print();
  System.out.println("Sorted array (Insertion Sort): ");
  sorting3.print();
  }
  
}
