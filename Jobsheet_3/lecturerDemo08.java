package Jobsheet_3;
import java.util.Scanner;
public class lecturerDemo08 {
  static lecturer08[] lecturerArray;
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int inputMenu;
        do {
          String mainMenu = ("Main Menu: \n"
              + "1. Input Data Lecturers\n"
              + "2. Show All Lecturers Data\n"
              + "3. Display Lecturer Based Gender\n"
              + "4. Average Age of Lecturer based on Gender\n"
              + "5. Show Oldest Lecturer Info\n"
              + "6. Show Youngest Lecturer Info\n"
              + "7. Exit"
              );
          System.out.println("========================================");
          System.out.println(mainMenu);
          System.out.print("Choose: ");
          inputMenu = sc.nextInt();
          switch (inputMenu) {
            case 1:
              inputData();
              break;
            case 2:
              lecturerData08.showAllLecturerData(lecturerArray);
              break;
            case 3:
              lecturerData08.countLecturerByGender(lecturerArray);
              break;
            case 4:
              lecturerData08.averageLecturerAgeByGender(lecturerArray);
              break;
              case 5:
              lecturerData08.showOldestLecturerInfo(lecturerArray);
              break;
              case 6:
              lecturerData08.showYoungestLecturerInfo(lecturerArray);
              break;
              case 7:
              System.out.println("Thank You!");
              return;
            default:
              System.out.println("Your input is invalid");
              break;
          }
        } while (inputMenu != 7);
  }
  public static void inputData(){
    Scanner sc = new Scanner(System.in);
    System.out.print("How many data that you want to input?: ");
    int input = sc.nextInt();
    sc.nextLine();
    lecturerArray = new lecturer08[input];
        for (int i = 0; i < input; i++) {
            System.out.println("\nEnter data for Lecturer " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender (true for Male, false for Female): ");
            boolean gender = sc.nextBoolean();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer

            lecturerArray[i] = new lecturer08(id, name, gender, age);
            
        }
  }
}
