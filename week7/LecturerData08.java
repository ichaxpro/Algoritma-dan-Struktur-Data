package week7;

public class LecturerData08 {
  lecturer08[] lecturerData = new lecturer08[10];
  int idx;

  public void add(lecturer08 dsn) {
    if (idx < lecturerData.length) {
      lecturerData[idx] = dsn;

      idx++;
    } else {
      System.out.println("Lecturer list is full!");
    }
  }

  public void print() {
    if (idx == 0) {
      System.out.println("No lecturers available.");
      return;
    }
    for (int i = 0; i < idx; i++) {
      lecturerData[i].print();
    }
  }

  public void sortingASC() { // using bubble sort
    for (int i = 0; i < idx - 1; i++) {
      for (int j = 0; j < idx - i - 1; j++) {
        if (lecturerData[j].age > lecturerData[j + 1].age) {
          lecturer08 temp = lecturerData[j];
          lecturerData[j] = lecturerData[j + 1];
          lecturerData[j + 1] = temp;
        }
      }
    }
  }

  public void sortingDSC() { // using selection sort
    for (int i = 0; i < idx - 1; i++) {
      int minIndex = i;
      for (int j = i + 1; j < idx; j++) {
        if (lecturerData[j].age < lecturerData[minIndex].age) {
          minIndex = j;
        }
      }
      lecturer08 temp = lecturerData[minIndex];
      lecturerData[minIndex] = lecturerData[i];
      lecturerData[i] = temp;
    }
  }

  public void findSeqSearch(int search) {
    int foundCount = 0;
    for (int i = 0; i < idx; i++) {
        if (lecturerData[i].age == search) {
            foundCount++;
            showData(search, i);
        }
    }

    if (foundCount > 1) {
        System.out.println("Warning: Multiple results found for age " + search);
    }
}

public void findBinarySearch(int search, int left, int right) {
    int mid;
    int foundCount = 0;
    
    while (right >= left) {
        mid = (left + right) / 2;
        if (lecturerData[mid].age == search) {
            foundCount++;
            showData(search, mid);
            
            int tempLeft = mid - 1;
            while (tempLeft >= left && lecturerData[tempLeft].age == search) {
                showData(search, tempLeft);
                foundCount++;
                tempLeft--;
            }

            int tempRight = mid + 1;
            while (tempRight <= right && lecturerData[tempRight].age == search) {
                showData(search, tempRight);
                foundCount++;
                tempRight++;
            }

            break;
        } else if (lecturerData[mid].age > search) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    if (foundCount > 1) {
        System.out.println("Warning: Multiple results found for age " + search);
    }
}

public void showPosition(int searchAge) {
    System.out.println("Searching for age " + searchAge + "...");
}

public void showData(int searchAge, int pos) {
    System.out.println("NIM \t : " + lecturerData[pos].id);
    System.out.println("Name \t : " + lecturerData[pos].name);
    System.out.println("Age \t : " + lecturerData[pos].age);
    System.out.println("Gender \t : " + (lecturerData[pos].gender ? "Male" : "Female"));
    System.out.println("------------------------------------");
}
}
