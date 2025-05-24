package Jobsheet13;

import Jobsheet12.main;

public class DoubleLinkedListMain {
  public static void main(String[] args) {
    DoubleLinkedList dll = new DoubleLinkedList();
    System.out.println("--------------------");
    dll.print();
    dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
    System.out.println("--------------------");
    dll.print();
    dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
    System.out.println("--------------------");
    dll.print();
    dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
    System.out.println("--------------------");
    dll.print();
    dll.insertAfter("111", new Student("114", "Rizki", "TI-1I", 3.8));
    System.out.println("--------------------");
    dll.print();
    dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
    System.out.println("--------------------");
    dll.print();
    dll.insertAfter("120", new Student("116", "Eiyu", "TI-1I",3.4));
    System.out.println("--------------------");
    dll.print();
    dll.add(3, new Student("134", "Icha", "TI-1I",3.4));
    System.out.println("----------------------------------------");
    dll.getFirst().print();
    dll.getLast().print();
    dll.getIndex(2);
    dll.removeFirst();
    System.out.println("--------------------");
    dll.print();
    dll.removeLast();
    System.out.println("--------------------");
    dll.print();
    dll.remove(1);
    System.out.println("--------------------");
    dll.print();
    System.out.println("Double Linked List size: " + dll.size);
    dll.indexOf("134");

  }
}
