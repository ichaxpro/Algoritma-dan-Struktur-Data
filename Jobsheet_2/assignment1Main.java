public class assignment1Main {
    public static void main(String[] args) {
      assignment1 course1 = new assignment1();
      course1.courseID = "MK123";
      course1.name = "Pancasila";
      course1.credit = 2;
      course1.hour = 4;
      course1.print();
      System.out.println("------------------------------");
      course1.reduceHour(5);
      course1.changeCredit(3);
      course1.print();
      System.out.println("===============================");
      assignment1 course2 = new assignment1("PR123", "RPL", 2, 6);
      course2.print();
      System.out.println("----------------------------------");
      course2.reduceHour(2);
      course2.changeCredit(3);
      course2.print();
    }
  }
  

