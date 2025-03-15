package week5;
import java.util.Scanner;

public class sumMain {
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Input element number: ");
    int element = input.nextInt();
    
    sum sm = new sum(element);
    for (int i =0; i<element;i++){
      System.out.print("Input profit #"+(i+1)+": ");
      sm.profits[i] = input.nextDouble();
    }

    System.out.println("Profit total using BF: "+sm.totalBF());
    System.out.println("Profit total using DC: "+sm.totalDC(sm.profits, 0, element-1));
  }
}
