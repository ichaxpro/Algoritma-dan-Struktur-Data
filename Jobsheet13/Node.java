package Jobsheet13;

public class Node {
  Student data;
  Node next;
  Node prev;

  public Node() {
  }

  public Node(Node prev, Student data, Node next ) {
    this.data = data;
    this.next = next;
    this.prev = prev;
  }
  public Node(Student data) {
    this.data = data;
    prev = null;
    next = null;
  }
}


