package Jobsheet_3;

public class arrayBlocks {
  public static void main(String[] args) {
    blocks[] blArray = new blocks[3];
    blArray[0] = new blocks(100, 30, 12);
    blArray[1] = new blocks(120, 40, 15);
    blArray[2] = new blocks(210, 50, 25);

    for (int i =0;i<3; i++){
      System.out.println("Volume blocks - " + i + " : " + blArray[i].countVolume());
    }
  }
}
