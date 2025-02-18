import java.util.Scanner;
public class looping {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    String nim;
    System.out.print("Masukkan NIM: ");
    nim = sc.nextLine();
    int n =Integer.parseInt(nim.substring(nim.length()-2));
    if (n<10){
      n+=10;
    }
    System.out.println("n: " +n);
    for (int i = 1;i <= n;i++){
      if (i==6 || i==10){
        continue;
      }
            if (i % 2 == 0) {
                System.out.print(i);
            }else {
                System.out.print( "*");
            }
    }
    }
  }



  

