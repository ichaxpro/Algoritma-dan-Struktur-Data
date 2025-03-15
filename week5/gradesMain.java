package week5;

public class gradesMain {
  public static void main(String[] args) {
   grades university = new grades();
   int maxElementMidterm = grades.findMaxMidtermScore(university.midterm, 0, university.midterm.length-1);
   System.out.println("The Maximum Score of Midterm is: "+ maxElementMidterm );
   int minElementMidterm = grades.findMinMidtermScore(university.midterm, 0, university.midterm.length-1);
   System.out.println("The minimum Score of Midterm is "+ minElementMidterm);
   double avg = grades.AverageFinalScore(university.finalScore);
   System.out.println("The Average Score of Final Score is: " +avg);
   


   
    
    
    
    }
  }

