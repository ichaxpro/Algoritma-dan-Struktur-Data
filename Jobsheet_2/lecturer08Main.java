public class lecturer08Main {
  public static void main(String[] args) {
    lecturer08 lecturer1 = new lecturer08();
    lecturer1.lecturerID = "abc123";
    lecturer1.name = "Budi";
    lecturer1.statusLecturer = true;
    lecturer1.startYear = 2005;
    lecturer1.expertiseField = "Design";
    lecturer1.print();
    System.out.println("---------------------------------");
    lecturer1.changeExpertiseField("IOT");
    lecturer1.setStatus(false);
    lecturer1.print();
    int tenure1 = lecturer1.calculateTenure(2025);
    System.out.println("Lecturer Tenure: " + tenure1 + " years");
    System.out.println("=======================================");
    lecturer08 lecturer2 = new lecturer08("QWE123", "Setawan", true, 2020, "Machine Learning");
    lecturer2.print();
    int tenure2 = lecturer2.calculateTenure(2025);
    System.out.println("Lecturer Tenure: " + tenure2 + " years");
    System.out.println("--------------------------------");
    lecturer2.changeExpertiseField("Database");
    lecturer2.setStatus(false);
    lecturer2.print();

  }
}
