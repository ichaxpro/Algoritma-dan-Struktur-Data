public class lecturer08 {
    String lecturerID;
    String name;
    boolean statusLecturer;
    int startYear;
    String expertiseField;
  
    public lecturer08(){
  
    }
    public lecturer08(String id, String name, boolean active, int year, String expertise){
      lecturerID = id;
      this.name = name;
      statusLecturer = active;
      startYear = year;
      expertiseField = expertise;
    }
    void print(){
      System.out.println("Lecturer ID: "+ lecturerID);
      System.out.println("Name: " + name);
      System.out.println("Status: "+(statusLecturer ? "Active" : "Inactive"));
      System.out.println("Start Year: "+startYear);
      System.out.println("Expertise: "+expertiseField);
  
    }
    void setStatus(boolean status) {
      this.statusLecturer = status;  // Mengupdate statusLecturer dengan nilai yang diberikan
    }
    int calculateTenure (int yearNow){
      int service = yearNow-startYear;
      return service;
    }
    void changeExpertiseField(String newField ){
      expertiseField = newField;
    }
  }
  