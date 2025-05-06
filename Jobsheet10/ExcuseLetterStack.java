package Jobsheet10;

public class ExcuseLetterStack {
  ExcuseLetter08[] excuse;
  int size, top;

  public ExcuseLetterStack(int size){
    this.size = size;
    top = -1;
    excuse = new ExcuseLetter08[size];
  }

  public boolean isFull(){
    if (top==size-1){
      return true;
    }else{
      return false;
    }
  }

  public boolean isEmpty(){
    if (top == -1){
      return true;
    }else{
      return false;
    }
  }

  public void push(ExcuseLetter08 exc){
    if (!isFull()){
      top++;
      excuse[top] = exc;
    }else{
      System.out.println("Stack is already full!!");
    }
  }

  public ExcuseLetter08 pop(){
    if (!isEmpty()){
      ExcuseLetter08 exc = excuse[top];
      top--;
      return exc;
    }else{
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  public ExcuseLetter08 peek(){
    if (!isEmpty()){
      return excuse[top];
    }else{
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  public void print(){
    for (int i =0;i<=top;i++){
      System.out.println(excuse[i].id+"\t"+excuse[i].name+"\t"+excuse[i].className+"\t"+excuse[i].typeOfExcuse+"\t"+excuse[i].duration);
    }
    System.out.println("");
  }

  public ExcuseLetter08 firstSubmitted(){
    if (!isEmpty()){
      return excuse[0];
    }else{
      System.out.println("There's no data in Stack!");
      return null;
    }
  }

  public void findSeqSearch(String search){
    boolean found = false;
    for (int i=0; i < top;i++){
      if (excuse[i].name.equalsIgnoreCase(search)){
        System.out.println("Excuse Letter Found: ");
        System.out.println("Name: " +excuse[i].id);
        System.out.println("Name: " +excuse[i].name);
        System.out.println("Name: " +excuse[i].className);
        System.out.println("Name: " +excuse[i].typeOfExcuse);
        System.out.println("Name: " +excuse[i].duration);
        found = true;
      }
    } 
    if (!found){
      System.out.println("No excuse letter found for name: " + search);
    }
  }
}
