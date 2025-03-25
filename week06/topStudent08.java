package week06;

public class topStudent08 {
  student08[] listStudent08s;
  int idx;

  public topStudent08(int size){
    int idx =0;
    listStudent08s = new student08[size];
  }

  public void add(student08 student){
    if (idx < listStudent08s.length){
      listStudent08s[idx] = student;
      idx++;
    }else{
      System.out.println("List is full");
    }
  }

  public void print(){
    for (int i = 0; i< idx; i++){
      listStudent08s[i].print();
    }
  }

  public void bubbleSort(){
    for (int i = 0; i<idx-1; i++){
      for (int j =0; j < idx-i-1; j++){
        if (listStudent08s[j].gpa < listStudent08s[j+1].gpa){
          student08 temp = listStudent08s[j];
          listStudent08s[j] = listStudent08s[j+1];
          listStudent08s[j+1] = temp;
        }
      }
    }
  }

  public void selectionSort(){
    for (int i =0; i< idx -1; i++){
      int minIndex =i;
      for(int j = i +1; j<idx;j++){
        if (listStudent08s[j].gpa < listStudent08s[minIndex].gpa){
          minIndex =j;
        }
      }
      student08 temp = listStudent08s[minIndex];
      listStudent08s[minIndex] =listStudent08s[i];
      listStudent08s[i] = temp;
    }
  }

  public void insertionSort(){
    for (int i =1; i<idx; i++){
      student08 temp = listStudent08s[i];
      int j = i;

      while(j > 0 && listStudent08s[j-1].gpa < temp.gpa){
        listStudent08s[j] = listStudent08s[j-1];
        j--;
      } 
      listStudent08s[j] = temp;
    }
  }
}
