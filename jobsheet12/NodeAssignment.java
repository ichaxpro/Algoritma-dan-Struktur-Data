package Jobsheet12;

public class NodeAssignment {
  Student data;
  NodeAssignment next;

  public NodeAssignment() {
  }

  public NodeAssignment(Student data, NodeAssignment next) {
    this.data = data;
    this.next = next;
  }
  public NodeAssignment(Student data) {
    this.data = data;
  }
}

