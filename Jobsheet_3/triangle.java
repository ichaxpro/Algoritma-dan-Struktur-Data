package Jobsheet_3;
public class triangle {
public int base;
public int height;

public triangle(int a, int b){
  base =a;
  height = b;
}

double countArea(){
  double area = 0.5*base*height;
  return area;
}
double countPerimeter(){
  double c = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
  double perimeter = base+height+c;
  return perimeter;
}

}
