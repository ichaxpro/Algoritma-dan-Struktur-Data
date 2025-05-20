package Jobsheet12;

public class StudentQueue {
  NodeAssignment front, rear;
  int size;

  public StudentQueue(){
    front = null;
        rear = null;
        size = 0;
  }
  public boolean isEmpty() {
        return front == null;
    }

    
    public boolean isFull() {
        return false; 
    }

   
    public void clear() {
        front = rear = null;
        size = 0;
    }

    
    public void enqueue(Student student) {
        NodeAssignment newNode = new NodeAssignment(student);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    
    public Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        Student removed = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return removed;
    }

    
    public Student peekFront() {
        if (!isEmpty()) return front.data;
        return null;
    }

    
    public Student peekRear() {
        if (!isEmpty()) return rear.data;
        return null;
    
  }
   
    public int getSize() {
        return size;
    }
    public void print() {
    if (isEmpty()) {
        System.out.println("Queue is empty.");
        return;
    }

    NodeAssignment current = front;
    System.out.println("Students in the queue:");
    int number = 1;
    while (current != null) {
        System.out.println(number + ". " + current.data);
        current = current.next;
        number++;
    }
}
}

