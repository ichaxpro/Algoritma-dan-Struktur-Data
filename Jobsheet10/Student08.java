package Jobsheet10;

public class Student08 {
  String nim;
  String name;
  String className;
  int grade;

  public Student08(){
  }

  public Student08(String nim, String name, String className){
    this.nim = nim;
    this.name = name;
    this.className = className;
    this.grade = -1;
  }

  public void grading(int grade){
    this.grade = grade;
  }
}
