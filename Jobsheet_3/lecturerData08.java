package Jobsheet_3;

public class lecturerData08 {
  public static void showAllLecturerData(lecturer08[] lecturerArray) {
    if (lecturerArray == null) {
      System.out.println("No data available");
    } else {
      System.out.println("================================================================================");
      System.out.printf("| %-10s | %-20s | %-10s | %-5s |\n", "ID", "Name", "Gender", "Age");
      System.out.println("================================================================================");

      // Isi data
      for (lecturer08 lecturer : lecturerArray) {
        System.out.printf("| %-10s | %-20s | %-10s | %-5d |\n",
            lecturer.id, lecturer.name, (lecturer.gender ? "Male" : "Female"), lecturer.age);
      }
      

      // Garis akhir tabel
      System.out.println("================================================================================");
    }

  }

  public static void countLecturerByGender(lecturer08[] lecturerArray) {
    int maleCount = 0;
    int femaleCount = 0;
    for (lecturer08 lec : lecturerArray) {
      if (lec.gender == true) {
        maleCount++;
      } else {
        femaleCount++;
      }
    }
    System.out.println("Male Lecturers: " + maleCount);
    System.out.println("Female Lecturers: " + femaleCount);
  }

  public static void averageLecturerAgeByGender(lecturer08[] lecturerArray) {
    int totalAgeMale = 0;
    int totalAgeFemale = 0;
    int maleCount = 0;
    int femaleCount = 0;
    for (lecturer08 lecturer : lecturerArray) {
      if (lecturer.gender == true) {
        totalAgeMale += lecturer.age;
        maleCount++;
      } else if (lecturer.gender == false) {
        totalAgeFemale += lecturer.age;
        femaleCount++;
      }
    }
    if (maleCount > 0) {
      double averageAgeMale = totalAgeMale / maleCount;
      System.out.println("Average age of male lecturers are: " + averageAgeMale);
    } else {
      System.out.println("There's no male lecturer");
    }

    if (femaleCount > 0) {
      double averageAgeFemale = totalAgeFemale / femaleCount;
      System.out.println("Average age of female lecturers are: " + averageAgeFemale);
    } else {
      System.out.println("There no female lecturers");
    }
  }

  public static void showOldestLecturerInfo(lecturer08[] lecturerArray) {
    if (lecturerArray == null) {
      System.out.println("There's no data available");
    }
    lecturer08 oldestLecturer = lecturerArray[0];
    for (lecturer08 lecturer : lecturerArray) {
      if (lecturer.age > oldestLecturer.age) {
        oldestLecturer = lecturer;
      }
    }
    System.out.println("OLDEST LECTURER INFORMATION");
    System.out.println("================================================================================");
    System.out.printf("| %-10s | %-20s | %-10s | %-5s |\n", "ID", "Name", "Gender", "Age");
    System.out.println("================================================================================");
    System.out.printf("| %-10s | %-20s | %-10s | %-5d |\n",
        oldestLecturer.id, oldestLecturer.name, (oldestLecturer.gender ? "Male" : "Female"), oldestLecturer.age);
    System.out.println("================================================================================");

  }

  public static void showYoungestLecturerInfo(lecturer08[] lecturerArray) {
    if (lecturerArray == null) {
      System.out.println("There's no data available");
    }
    lecturer08 youngestLecturer = lecturerArray[0];
    for (lecturer08 lecturer : lecturerArray) {
      if (lecturer.age < youngestLecturer.age) {
        youngestLecturer = lecturer;
      }
    }
    System.out.println("YOUNGEST LECTURER INFORMATION");
    System.out.println("================================================================================");
    System.out.printf("| %-10s | %-20s | %-10s | %-5s |\n", "ID", "Name", "Gender", "Age");
    System.out.println("================================================================================");
    System.out.printf("| %-10s | %-20s | %-10s | %-5d |\n",
        youngestLecturer.id, youngestLecturer.name, (youngestLecturer.gender ? "Male" : "Female"), youngestLecturer.age);
    System.out.println("================================================================================");
  }
}
