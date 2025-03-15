package week5;
import java.util.Scanner;

public class powerMain {
  public static void main(String[] args) {
    Scanner input =  new Scanner (System.in);
    System.out.println("Input element number: ");
    int element = input.nextInt();

    power[] png = new power[element];
    for (int i=0;i<element;i++){
      System.out.println("Input base number for " +(i+1)+ "th element");
      int basis = input.nextInt();
      System.out.println("Input exponent for "+(i+1)+ "th element");
      int exp = input.nextInt();
      png[i] = new power(basis, exp);
    }
    System.out.println("POWER RESULT USING BRUTEFORCE: ");
    for (power p : png){
      System.out.println(p.baseNumber+"^"+p.exponent+": "+p.powerBF());
    }
    System.out.println("POWER RESULT USING DIVIDE AND CONQUER: ");
    for (power p : png){
      System.out.println(p.baseNumber+"^"+p.exponent+": "+p.powerDC(p.baseNumber, p.exponent));
    }
  }
}
