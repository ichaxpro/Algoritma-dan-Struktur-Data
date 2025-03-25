package week06;

public class student08 {
  String nim;
  String name;
  String studentClass;
  double gpa;

  public student08(){

  }

  public student08(String nim, String name, String studentClass, double gpa){
    this.nim = nim;
    this.name = name;
    this.studentClass = studentClass;
    this.gpa = gpa;

    }

    public void print(){
      System.out.println("NIM: " + nim+ ", Name: " +name+ ", Class: " +studentClass+ ", GPA: " +gpa);
    }
  }

