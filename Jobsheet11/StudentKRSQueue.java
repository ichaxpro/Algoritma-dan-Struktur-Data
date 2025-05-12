package Jobsheet11;

public class StudentKRSQueue {
  StudentKRS[] data;
  int front, rear, size, max;
  int approvedCount =0;
  int max_students = 30;

  public StudentKRSQueue(int n){
    max = n;
    data = new StudentKRS[max];
    size = 0;
    front = 0;
    rear = -1;
  }

  public boolean isEmpty(){
    if (size == 0){
      return true;
    }else{
      return false;
    }
  }
  public boolean isFull(){
    if (size == max) {
      return true;
    }else{
      return false;
    }
  }

  public void enqueue(StudentKRS dt){
    if (isFull()){
      System.out.println("Queue is full!!");
      return;
  }
  rear = (rear+1)%max;
  data[rear] = dt;
  size++;
  System.out.printf("%s is succesfully added at index %d\n", dt.name, rear);
}
// 

void dequeue2() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            for (int i = 0; i < 2; i++) {
                if (!isEmpty()) {
                    System.out.println("Processing student:");
                    data[front].print();
                    front = (front + 1) % max;
                    size--;
                    approvedCount++;
                } else {
                    System.out.println("No more students in the queue.");
                    break;
                }
            }
        }
    }

  void printApprovedCount() {
        System.out.println("Total students approved: " + approvedCount);
    }

  public void peek(){
    if (!isEmpty()){
      System.out.println("Front data: " );
      data[front].print();
    }else{
      System.out.println("Queue is empty!!!");
    }
  }

  void peek2() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            if (size == 1) {
                System.out.println("Front data: ");
                data[front].print();
            } else {
                int temp = front;
                System.out.println("Front data: ");
                data[front].print();

                temp = (temp + 1) % max;
                System.out.println("Front data 2: ");
                data[temp].print();
            }
        }
    }
  public void print(){
    if (isEmpty()) {
      System.out.println("Queue is empty!!!");
      return;
    }
    int i = front;
    while (i != rear) {
      data[i].print();
      i = (i+1)%max;
    }
    data[i].print();
    System.out.println("Number of Element: "+size);
  }
  public void clear(){
    if (isEmpty()) {
      front = rear =-1;
      size = 0;
      System.out.println("All data has been succesfully removed");
    }else{
      System.out.println("Queue is already empty!!");
    }
  }

  public void viewRear() {
  if (!isEmpty()) {
    System.out.println("Rear data: " );
    data[rear].print();
  } else {
    System.out.println("Queue is empty!!");
    
  }
}

public void printRemainingStudent(){
  int remaining = max_students-approvedCount;
  System.out.println("Students not yet approved: " + remaining);
}
}
