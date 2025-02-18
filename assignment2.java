import java.util.Scanner;
public class assignment2 {
  public static void main(String[] args) {
    Scanner sc= new Scanner (System.in);
    System.out.print("What is the length of your cubes's side:  ");
    double side = sc.nextDouble();
    System.out.println("========================================");
    String mainMenu = ("What do you want to calculate: \n"
        + "1. Volume of the cubes\n"
        + "2. Surface Area of the cubes\n"
        + "3. Perimeter of the cubes\n"
       );
       System.out.println(mainMenu);
       System.out.print("Choose: ");
       int input = sc.nextInt();
       switch (input) {
        case 1:
          System.out.println("Volume: " +volumeCubes(side));
          break;
        case 2:
        System.out.println("Surface area: " +surfaceArea(side));
        break;
        case 3:
        System.out.println("Perimeter: "+perimeter(side));
        break;
        default:
        System.out.println("Your input is invalid");
          break;
       }
  }
  static double volumeCubes(double side){
    return Math.pow(side, 3);
  }
  static double surfaceArea(double side){
    double surface= 6 * Math.pow(side, 2);
    return surface;
  }
  static double perimeter(double side){
    double keliling = 12 * side;
    return keliling;
  }
}
