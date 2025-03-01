package Jobsheet_3;

public class blocks {
  public int width, length, height;

  public blocks(int p, int l, int t){
    length = p;
    width = l;
    height = t;
  }
  public int countVolume(){
    return length*width*height;
  }
}
