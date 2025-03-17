package week5;

public class studentData {
  public static student findMaxMidtermScore(student[] students, int l, int r) {
    if (l == r) {
      return students[l];
    }

    int mid = (l + r) / 2;
    student maxl = findMaxMidtermScore(students, l, mid);
    student maxr = findMaxMidtermScore(students, mid + 1, r);

    if (maxl.midterm > maxr.midterm) {
      return maxl;
    } else {
      return maxr;
    }

  }

  public static student findMinMidtermScore(student[] students, int l, int r) {
    if (l == r) {
      return students[l];
    }

    int mid = (l + r) / 2;
    student minl = findMinMidtermScore(students, l, mid);
    student minr = findMinMidtermScore(students, mid + 1, r);

    if (minl.midterm < minr.midterm) {
      return minl;
    } else {
      return minr;
    }
  }

  public static double AverageFinalScore(student[] students) {
    double sum = 0;
    double avg = 0;
    for (int i = 0; i < students.length; i++) {
      sum += students[i].finalScore;
    }
    avg = sum/students.length;
    return avg;
  }
}
