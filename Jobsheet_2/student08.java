public class student08 {
  public String name;
  String studentID;
  String className;
  double gpa;

  public student08(){

  }
  public student08(String id, String name, String cls, double gpa) { 
    studentID = id; 
    this.name = name; 
    className = cls; 
    this.gpa = gpa; 
    }
  void print() {
    System.out.println("student ID: " + studentID);
    System.out.println("Name: " + name);
    System.out.println("class Name: " + className);
    System.out.println("GPA :" + gpa);
    System.out.println("");
  }

  void changeClass(String classNameBaru) {
    className = classNameBaru;
  }

  void updateGPA(double newGPA) { 
    if (newGPA >= 0.0 && newGPA <= 4.0) {  // ✅ Cek newGPA, bukan gpa lama
      gpa = newGPA;
  } else {
      System.out.println("Invalid IPK. Must be between 0.0 and 4.0");
  }
  }

  String evaluate() {
    if (gpa >= 3.5) {
      return "Excellent";
    } else if (gpa >= 3.0) {
      return "Good";
    } else if (gpa >= 2.0) {
      return "Fair";
    } else {
      return "Poor";
    }

  }
}