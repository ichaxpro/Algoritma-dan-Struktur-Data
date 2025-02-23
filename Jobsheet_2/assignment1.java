public class assignment1{
  String courseID;
  String name;
  int credit;
  int hour;
  public assignment1(){

  }
  public assignment1(String id, String name, int sks, int hour) { 
    courseID = id; 
    this.name = name; 
    credit = sks; 
    this.hour = hour; 
    }

  void print(){
    System.out.println("Course ID: " + courseID);
    System.out.println("Name: " + name);
    System.out.println("Semester Credit: " + credit);
    System.out.println("Hour per Week :" + hour);
   
  }
  void changeCredit (int newCredit){
    credit = newCredit;
  }
  void addHour(int hours){
    if (hours > 0) {
      hour += hours;
  } else {
      System.out.println("Invalid hour addition. Must be greater than 0.");
  }
  }
  void reduceHour (int reduces){
    if (reduces > 0) {
      if (hour >= reduces) {
          hour -= reduces;
      } else {
          hour = 0;
          System.out.println("Reduction too large. Hour set to 0.");
      }
  } else {
      System.out.println("Invalid hour reduction. Must be greater than 0.");
  }
}
  }
