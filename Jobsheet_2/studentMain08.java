public class studentMain08{
  public static void main(String[] args) {
    student08 student1 = new student08();
    student1.studentID = "244107020097";
    student1.name ="Tiara";
    student1.className ="TI-1I";
    student1.gpa = 3.8;
    student1.print();
    student1.changeClass("TI-2I");
    student1.updateGPA(3.9);
    student1.print();
    
  }
}
