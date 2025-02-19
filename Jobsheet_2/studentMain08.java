public class studentMain08 {
  public static void main(String[] args) {
    student08 student1 = new student08();
    student1.studentID = "244107020097";
    student1.name = "Tiara";
    student1.className = "TI-1I";
    student1.gpa = 3.8;
    student1.print();
    student1.changeClass("TI-2I");
    student1.updateGPA(3.9);
    student1.print();
    student08 student2 = new student08("244107020040", "Rizky", "TI-1I", 3.5);
    student2.updateGPA(3.3);
    student2.print();
    student08 studentIcha = new student08("244107020023", "Dewi Chalissa Rania", "TI-1I", 3.7);
    studentIcha.print();
  }
}
