package Jobsheet_3;

public class triangleMain {
  public static void main(String[] args) {
    triangle[] trArray = new triangle[4];
    trArray[0] = new triangle(10, 4);
    trArray[1] = new triangle(20, 10);
    trArray[2] = new triangle(15, 6);
    trArray[3] = new triangle(25, 10);

    for (int i = 0; i < trArray.length; i++) {
      System.out.println("Triangle " + (i + 1) + ":");
      System.out.println("Area: " + trArray[i].countArea());
      System.out.println("Perimeter: " + trArray[i].countPerimeter());
      System.out.println();
  }
  }
}
