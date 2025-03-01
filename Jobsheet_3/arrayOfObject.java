package Jobsheet_3;
import java.util.Scanner;
public class arrayOfObject {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Input the length of array: ");
    int inputLength = sc.nextInt();
    rectangle[] rectangleArray = new rectangle[inputLength];
   
    for (int i =0; i<inputLength; i++){
      rectangleArray[i] = new rectangle();
      System.out.println("Rectangle "+ i);

      System.out.println("Input length : ");
      rectangleArray[i].length = sc.nextInt();

      System.out.println("Input width : ");
      rectangleArray[i].width = sc.nextInt();
    }

    for (int i =0;i<10; i++){
      System.out.println("Rectangle " + i);
      System.out.println("Width: " + rectangleArray[0].width + ", length: " + rectangleArray[0].length);
    }
  }
}
