import java.util.Scanner;

public class assignment3 {
  static String[] courseName;
  static int[] creditHours;
  static int[] semester;
  static String[] lectureDay;
  static int n;
  static boolean found;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String mainMenu = ("Select a choice from the menu: \n"
        + "1. Input Course Data\n"
        + "2. Display All Courses\n"
        + "3. Display Courses by Lecturer Day\n"
        + "4. Display Courses by Semester\n"
        + "5. Search for a Course\n"
        + "6. Exit");
    int menuChoice;
    do {
      System.out.println();
      System.out.println(mainMenu);
      System.out.print("Enter your choice: ");
      menuChoice = sc.nextInt();
      switch (menuChoice) {
        case 1:
          inputCourse();
          break;
        case 2:
          displayAllCourses();
          break;
        case 3:
          displayCoursesByDay();
          break;
        case 4:
          displayCoursesBySemester();
          break;
        case 5:
          searchCourse();
          break;
        case 6:
          System.out.println("Thank you!");
          break;
        default:
          System.out.println("Invalid Input");
          break;

      }
    } while (menuChoice != 6); // untuk menghentikan looping
  }

  static void inputCourse() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah mata kuliah: ");
    n = sc.nextInt();
    sc.nextLine(); // Konsumsi newline setelah nextInt()
    courseName = new String[n];
    creditHours = new int[n];
    semester = new int[n];
    lectureDay = new String[n];
    for (int i = 0; i < n; i++) {
      System.out.println("Mata kuliah ke-" + (i + 1) + ":");
      System.out.println("=================================");
      System.out.print("Nama Mata Kuliah: ");
      courseName[i] = sc.nextLine();

      System.out.print("SKS: ");
      creditHours[i] = sc.nextInt();

      System.out.print("Semester: ");
      semester[i] = sc.nextInt();
      sc.nextLine(); // Konsumsi newline setelah nextInt()

      System.out.print("Hari Kuliah: ");
      lectureDay[i] = sc.nextLine();
    }

  }

  static void displayAllCourses() {
    if (n == 0) {
      System.out.println("Data belum dimasukkan");
      return;
    } else {
      System.out.println("Daftar Mata Kuliah:");
      System.out.println("------------------------------------------------------");
      System.out.printf("%-3s | %-20s | %-3s | %-8s | %-10s%n",
          "No", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
      System.out.println("------------------------------------------------------");

      // Loop untuk menampilkan semua kursus
      for (int i = 0; i < n; i++) {
        System.out.printf("%-3d | %-20s | %-3d | %-8d | %-10s%n",
            (i + 1), courseName[i], creditHours[i], semester[i], lectureDay[i]);
      }

    }
  }

  static void displayCoursesByDay() {
    if (n == 0) {
      System.out.println("Data belum dimasukkan");
      return;
    } else {
      Scanner sc = new Scanner(System.in);
      System.out.print("Please input the day: ");
      String day = sc.nextLine();
      System.out.println("Daftar Mata Kuliah:");
      System.out.println("------------------------------------------------------");
      System.out.printf("%-3s | %-20s | %-3s | %-8s | %-10s%n",
          "No", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
      System.out.println("------------------------------------------------------");
      found = false;
      for (int i = 0; i < n; i++)
        if (day.equalsIgnoreCase(lectureDay[i])) {
          System.out.printf("%-3d | %-20s | %-3d | %-8d | %-10s%n",
              (i + 1), courseName[i], creditHours[i], semester[i], lectureDay[i]);
          found = true;
        }
    }
    if (!found) {
      System.out.println("There's no data");
    }
  }

  static void displayCoursesBySemester() {
    if (n == 0) {
      System.out.println("Data belum dimasukkan");
      return;
    } else {
      Scanner sc = new Scanner(System.in);
      System.out.print("Input your semester: ");
      int semesters = sc.nextInt();
      System.out.println("Daftar Mata Kuliah:");
      System.out.println("------------------------------------------------------");
      System.out.printf("%-3s | %-20s | %-3s | %-8s | %-10s%n",
          "No", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
      System.out.println("------------------------------------------------------");
      found = false;
      // Loop untuk menampilkan semua kursus
      for (int i = 0; i < n; i++) {
        if (semesters == semester[i]) {
          System.out.printf("%-3d | %-20s | %-3d | %-8d | %-10s%n",
              (i + 1), courseName[i], creditHours[i], semester[i], lectureDay[i]);
          found = true;
        }
      }
    }
    if (!found) {
      System.out.println("There's no data");
    }
  }

  static void searchCourse() {
    if (n == 0) {
      System.out.println("Data belum dimasukkan");
      return;
    } else {
      Scanner sc = new Scanner(System.in);
      System.out.print("Course Name: ");
      String course = sc.nextLine();
      System.out.println("Daftar Mata Kuliah:");
      System.out.println("------------------------------------------------------");
      System.out.printf("%-3s | %-20s | %-3s | %-8s | %-10s%n",
          "No", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
      System.out.println("------------------------------------------------------");
      found = false;
      // Loop untuk menampilkan semua kursus
      for (int i = 0; i < n; i++) {
        if (course.equalsIgnoreCase(courseName[i])) {
          System.out.printf("%-3d | %-20s | %-3d | %-8d | %-10s%n",
              (i + 1), courseName[i], creditHours[i], semester[i], lectureDay[i]);
          found = true;
        }

      }

    }
    if (!found) {
      System.out.println("There's no data");
    }
  }
}
