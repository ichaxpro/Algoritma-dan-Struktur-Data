import java.util.Scanner;

public class assignment1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] codeCar = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'H', 'L', 'N', 'T' };
    char city[][] = {
        { 'B', 'A', 'N', 'T', 'E', 'N' },
        { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
        { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
        { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
        { 'B', 'O', 'G', 'O', 'R' },
        { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
        { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
        { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
        { 'M', 'A', 'L', 'A', 'N', 'G' },
        { 'T', 'E', 'G', 'A', 'L' }
    };
    boolean found = false;
    System.out.print("Please input the plate code: ");
    char plateCode = sc.next().charAt(0);
    for (int i = 0; i < codeCar.length; i++) {
      if (codeCar[i] == plateCode) {
        System.out.print("The plate code is from: ");
        for (char plate : city[i]) {
          System.out.print(plate);
        }
        found = true;
        break;
        
      }
    }
    sc.close();
    if (!found) {
      System.out.println("Plate code is not valid");
    }

  }
}
