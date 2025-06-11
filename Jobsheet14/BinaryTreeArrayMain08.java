public class BinaryTreeArrayMain08 {
  public static void main(String[] args) {
    BinaryTreeArray08 bta = new BinaryTreeArray08();
    // Student08 m1 = new Student08("244107020138", "Devin", "TI-1I", 3.57);
    // Student08 m2 = new Student08("244107020023", "Dewi", "TI-1I", 3.85);
    // Student08 m3 = new Student08("244107020225", "Wahyu", "TI-1I", 3.21);
    // Student08 m4 = new Student08("244107020076", "Angelina", "TI-1I", 3.54);
    // Student08 m5 = new Student08("244107020223", "Andhika", "TI-1I", 3.72);
    // Student08 m6 = new Student08("244107020226", "Bima", "TI-1I", 3.37);
    // Student08 m7 = new Student08("244107020181", "Eiyu", "TI-1I", 3.46);
    // Student08[] data = { m1, m2, m3, m4, m5, m6, m7 };
   bta.add(new Student08("244107020138", "Devin", "TI-1I", 3.57));
    bta.add(new Student08("244107020023", "Dewi", "TI-1I", 3.85));
    bta.add(new Student08("244107020225", "Wahyu", "TI-1I", 3.21));
    bta.add(new Student08("244107020076", "Angelina", "TI-1I", 3.54));
    bta.add(new Student08("244107020223", "Andhika", "TI-1I", 3.72));
    bta.add(new Student08("244107020226", "Bima", "TI-1I", 3.37));
    bta.add(new Student08("244107020181", "Eiyu", "TI-1I", 3.46));
    // bta.populateData(data, data.length - 1);
    System.out.println("In-order traversal:");
    bta.traverseInOrder(0);
    System.out.println("Pre-Order Traversal: ");
    bta.traverseInOrder(0);
  }
}
