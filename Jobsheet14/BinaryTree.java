public class BinaryTree {
  Node root;

  public BinaryTree() {
    root = null;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void addRekursif(Student08 data) {
    root = addRekursif(root, data);
  }

  private Node addRekursif(Node current, Student08 data) {
    if (current == null) {
      return new Node(data);
    }
    if (data.ipk < current.data.ipk) {
      current.left = addRekursif(current.left, data);
    } else if (data.ipk > current.data.ipk) {
      current.right = addRekursif(current.right, data);
    }

    return current;
  }

  public void getMinIPK() {
    if (isEmpty()) {
      System.out.println("Tree is Empty!!");
    } else {
      Node current = root;
      while (current.left != null) {
        current = current.left;
      }
      current.data.print();
    }
  }

  public void getMaxIPK() {
    if (isEmpty()) {
      System.out.println("Tree is Empty!!");
    } else {
      Node current = root;
      while (current.right != null) {
        current = current.right;
      }
      current.data.print();
    }
  }

  public void displayStudentsWithIPKAbove(double threshold) {
    System.out.println("Mahasiswa dengan IPK di atas " + threshold + ":");
    displayAboveThresholdRecursive(root, threshold);
    System.out.println("--------------------");
  }

  private void displayAboveThresholdRecursive(Node node, double threshold) {
    if (node != null) {
      displayAboveThresholdRecursive(node.left, threshold);
      

      if (node.data.ipk > threshold) {
        node.data.print();
      }

      displayAboveThresholdRecursive(node.right, threshold);
      
    }
  }

  public void add(Student08 data) {
    if (isEmpty()) {
      root = new Node(data);
    } else {
      Node current = root;
      while (true) {
        if (data.ipk < current.data.ipk) {
          if (current.left != null) {
            current = current.left;
          } else {
            current.left = new Node(data);
            break;
          }
        } else if (data.ipk > current.data.ipk) {
          if (current.right != null) {
            current = current.right;
          } else {
            current.right = new Node(data);
            break;
          }
        } else {
          break;
        }
      }
    }
  }

  public boolean find(double ipk) {
    boolean result = false;
    Node current = root;
    while (current != null) {
      if (current.data.ipk == ipk) {
        result = true;
        break;
      } else if (ipk < current.data.ipk) {
        current = current.left;
      } else {
        current = current.right;
      }
    }
    return result;
  }

  public void traversePreOrder(Node node) {
    if (node != null) {
      node.data.print();
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  public void traverseInOrder(Node node) {
    if (node != null) {
      traverseInOrder(node.left);
      node.data.print();
      traverseInOrder(node.right);
    }
  }

  public void traversePostOrder(Node node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      node.data.print();
    }
  }

  Node getSuccessor(Node del) {
    Node successor = del.right;
    Node sucessorParent = del;
    while (successor.left != null) {
      sucessorParent = successor;
      successor = successor.left;
    }
    if (successor != del.right) {
      sucessorParent.left = successor.right;
      successor.right = del.right;
    }
    return successor;
  }

  public void delete(double ipk) {
    if (isEmpty()) {
      System.out.println("Tree is empty!!");
      return;
    }
    Node parent = root;
    Node current = root;
    boolean isLeftChild = false;
    while (current.data.ipk != ipk) {
      parent = current;
      if (ipk < current.data.ipk) {
        isLeftChild = true;
        current = current.left;
      } else {
        isLeftChild = false;
        current = current.right;
      }
      if (current == null) {
        System.out.println("Couldn't find data!!");
        return;
      }
    }
    if (current.left == null && current.right == null) {
      if (current == root) {
        root = null;
      } else if (isLeftChild) {
        parent.left = null;
      } else {
        parent.right = null;
      }
    } else if (current.right == null) {
      if (current == root) {
        root = current.left;
      } else if (isLeftChild) {
        parent.left = current.left;
      } else {
        parent.right = current.left;
      }
    } else if (current.left == null) {
      if (current == root) {
        root = current.right;
      } else if (isLeftChild) {
        parent.left = current.right;
      } else {
        parent.right = current.right;
      }
    } else {
      Node successor = getSuccessor(current);
      if (current == root) {
        root = successor;
      } else if (isLeftChild) {
        parent.left = successor;
      }
      successor.left = current.left;
    }
  }
}
