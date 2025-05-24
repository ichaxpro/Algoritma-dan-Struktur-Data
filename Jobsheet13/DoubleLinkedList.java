package Jobsheet13;

public class DoubleLinkedList {
  Node head, tail;
  int size;

  public DoubleLinkedList(){
    head= null;
    tail = null;
  }
  public boolean isEmpty(){
    return head == null;
  }
  public void add(int index, Student data) {
    if (index < 0 || index > size) {
        System.out.println("Invalid index!");
        return;
    }

    if (index == 0) {
        addFirst(data);
    } else if (index == size) {
        addLast(data);
    } else {
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }
    size++;
}

  public void addFirst(Student data){
    Node newNode = new Node(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    size++; 
}


  public void addLast(Student data){
    Node newNode = new Node(data);
    if (isEmpty()) {
        head = tail = newNode;
    } else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    size++; 
 }


  public void insertAfter(String key, Student data){
    Node newNode = new Node(data);
    Node temp = head;
    while (temp != null) {
      if (temp.data.nim.equalsIgnoreCase(key)) {
        if (temp==tail) {
          addLast(data);
        }else{
          newNode.next = temp.next;
          newNode.prev = temp;
          temp.next.prev = newNode;
          temp.next = newNode;
          size++;
          break;
        }
        return;
      }
      temp = temp.next;
    }
    if (temp == null) {
      System.out.println("Insertion failed. Data ("+key+") not found!!");
    }
  }

  void print(){
    if (!isEmpty()) {
      Node temp = head;
      while (temp != null) {
        temp.data.print();
        temp = temp.next;
      }
      System.out.println("");
    }else{
      System.out.println("Double linked list is currently Empty!!");
    }
  }

  public void removeFirst(){
    if (isEmpty()) {
        System.out.println("Double Linked List is currently empty!!");
    } else if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    size--; 
}


  public void removeLast(){
    if (isEmpty()) {
        System.out.println("Double linked list is currently empty!!");
    } else if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
    size--; 
}


  public void remove(int index) {
    if (index < 0) {
        System.out.println("Index is negative!!");
    } else if (index >= size) {
        System.out.println("Index exceeds the size of the list!!");
    } else {
        if (isEmpty()) {
            System.out.println("Double Linked List is currently empty!!");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
        size--;
    }
}
public void removeAfter(String key){
    if (isEmpty()) {
        System.out.println("Double Linked List is empty!");
        return;
    }

  Node temp = head;
  while (temp != null) {
    if (temp.data.nim.equalsIgnoreCase(key)) {
      if (temp.next == null) {
                System.out.println("There is no node after the given key!");
                return;
      }else if (temp==tail) {
          removeLast();
    }else{
      Node remove = temp.next;
      remove.next.prev = temp;
      size--;
    }
    return;
    }
    temp = temp.next;
  }
  System.out.println("Remove failed. Data (" +key+") not found!");
}

public Student getFirst(){
  if (!isEmpty()){
    System.out.print("First data: ");
    return head.data;
  } else{
    return null;
  }
        
}
public Student getLast(){
  if (!isEmpty()){
    System.out.print("Last data: ");
    return tail.data;
  } else{
    return null;
  }
}

public Student getIndex(int index){
  Node temp = head;
  for (int i = 0; i < index; i++) {
    temp = temp.next;
  }
   if (temp == null) {
        System.out.println("Index (" + index + ") exceeds the size of the list!!");
        return null;
    } else {
        System.out.print("Index (" + index + ") is: ");
        temp.data.print(); 
        return temp.data;
    }
}

public int getSize(){
  return size;
}

public int indexOf(String key) {
    if (isEmpty()) {
        System.out.println("Double Linked List is currently empty!!");
        return -1;
    }

    Node temp = head;
    int index = 0;

    while (temp != null) {
        if (temp.data.nim.equalsIgnoreCase(key)) {
            System.out.println("Data (" + key + ") found at index: " + index);
            return index;
        }
        temp = temp.next;
        index++;
    }

    System.out.println("Data (" + key + ") not found!!");
    return -1; 
}


}
