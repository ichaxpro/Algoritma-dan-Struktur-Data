package week5;

public class grades {
  int[] midterm={78,85,90,76,92,88,80,82};
  double[] finalScore = {82,88,87,79,95,85,83,84};
  

  public static int findMaxMidtermScore(int midterm[], int l,int r){
    if (l == r) {
      return midterm[l];
    }

   
    int mid = (l + r) / 2;
    int maxl = findMaxMidtermScore(midterm, l, mid);
    int maxr = findMaxMidtermScore(midterm, mid + 1, r);

    return Math.max(maxl, maxr);
    }

    public static int findMinMidtermScore(int midterm[], int l,int r){
      if (l == r) {
        return midterm[l];
      }
  
     
      int mid = (l + r) / 2;
      int minl = findMinMidtermScore(midterm, l, mid);
      int minr = findMinMidtermScore(midterm, mid + 1, r);
  
      return Math.min(minl, minr);
      }

      public static double AverageFinalScore(double arr[]){
        double sum=0;
        for (int i =0; i<arr.length;i++){
          sum+= arr[i];
        }
        return sum/arr.length;
      }
  }


