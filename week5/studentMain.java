package week5;

public class studentMain {
  public static void main(String[] args) {
    student[] students = {
      new student("Ahmad", "220101001", 2022, 78,82),
      new student("Budi", "220101002",2022,85, 88),
      new student("Cindy", "220101003", 2021,90, 87),
      new student("Dian", "220101004",2021,76, 79),
      new student("Eko", "220101005",2023, 92, 95),
      new student("Fajar", "220101006",2020, 88, 85),
      new student("Gina", "220101007",2023, 80, 83),
      new student("Hadi", "220101008",2020, 82, 84)
    };
   student maxScore = studentData.findMaxMidtermScore(students, 0, students.length-1);
   student minScore = studentData.findMinMidtermScore(students, 0, students.length-1);
   double avg = studentData.AverageFinalScore(students);

   System.out.println("The Highest Midterm Score: " + maxScore.name + " - " + maxScore.midterm);
   System.out.println("The Lowest Midterm Score: " + minScore.name + " - " + minScore.midterm );
   System.out.println("The Average Score of Final Test is: " + avg);

   
    
    
    
    }
  }

