public class BinaryTreeArray08 {
  Student08[] data;
  int idxLast;
  public BinaryTreeArray08(){
    data = new Student08[10];
    idxLast = -1;
  }
  public void populateData(Student08[] data, int idxLast){
    this.data = data;
    this.idxLast = idxLast;
  }

  public void add(Student08 student) {
    if (idxLast + 1 >= data.length) {
      System.out.println("Tree is full, cannot add more data.");
      return;
    }
    idxLast++;
    data[idxLast] = student;
  }

  public void traversePreOrder(int idxStart) {
    if (idxStart <= idxLast && data[idxStart] != null) {
      data[idxStart].print(); 
      traversePreOrder(2 * idxStart + 1); // kiri
      traversePreOrder(2 * idxStart + 2); // kanan
    }
  }

  public void traverseInOrder(int idxStart){
    if (idxStart <= idxLast) {
      if (data[idxStart] != null) {
        traverseInOrder(2 * idxStart + 1);
        data[idxStart].print();
        traverseInOrder(2*idxStart +2);
      }
    }
  }
}
