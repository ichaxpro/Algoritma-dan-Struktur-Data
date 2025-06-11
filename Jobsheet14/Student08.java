public class Student08 {
  String nim, name, className;
  double ipk;

  public Student08() {

  }

  public Student08(String nm, String name, String kls, double ipk) {
    nim = nm;
    this.name = name;
    className = kls;
    this.ipk = ipk;
  }

  public void print(){
    System.out.println(nim+ " - " +name+ " - " +className+ " - " +ipk);
  }
}