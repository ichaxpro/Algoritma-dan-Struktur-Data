package Jobsheet12;
public class Student {
  String nim, name, className, major;

  public Student(String nim, String name, String className, String major){
    this.nim = nim;
    this.name = name;
    this.className = className;
    this.major = major;
  }
  void print(){
    System.out.println(nim+ " - " + name+ " - " + major+ " - " +className );
  }
}