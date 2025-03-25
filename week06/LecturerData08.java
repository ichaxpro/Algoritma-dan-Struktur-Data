package week06;

public class LecturerData08 {
  lecturer08[] lecturerData = new lecturer08[10];
  int idx;

  public void add(lecturer08 dsn){
    if (idx < lecturerData.length) {
      lecturerData[idx] = dsn;
      idx++;
  } else {
      System.out.println("Lecturer list is full!");
  }
    }

    public void print(){
      if (idx == 0) {
        System.out.println("No lecturers available.");
        return;
    }
    for (int i = 0; i < idx; i++) {
        lecturerData[i].print(); 
    }
    }

    public void sortingASC(){ //using bubble sort
      for (int i=0; i <idx -1; i++){
        for (int j =0; j < idx -i-1; j++){
          if (lecturerData[j].age > lecturerData[j+1].age){
            lecturer08 temp = lecturerData[j];
            lecturerData[j] = lecturerData[j+1];
            lecturerData[j+1] = temp;
          }
        }
      }
    }
    public void sortingDSC(){ //using selection sort
        for (int i = 0; i < idx-1;i++){
          int minIndex = i;
          for (int j =i +1; j<idx; j++){
            if (lecturerData[j].age < lecturerData[minIndex].age){
              minIndex =j;
            }
          }
          lecturer08 temp = lecturerData[minIndex];
          lecturerData[minIndex] = lecturerData[i];
          lecturerData[i] = temp;
        }
      }

    
  } 

