package Jobsheet10;

public class StudentAssignmentStack08 {

  Student08[] stack;
  int size, top;

  public StudentAssignmentStack08(int size){
    this.size = size;
    top = -1;
    stack = new Student08[size];
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

  public void push(Student08 std){
    if (!isFull()){
      top++;
      stack[top] = std;
    }else{
      System.out.println("Stack is already full!!");
    }
  }

  public Student08 pop(){
    if (!isEmpty()){
      Student08 std = stack[top];
      top--;
      return std;
    }else{
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  public Student08 peek(){
    if (!isEmpty()){
      return stack[top];
    }else{
      System.out.println("There is no data in Stack!!");
      return null;
    }
  }

  public void print(){
    for (int i =0;i<=top;i++){
      System.out.println(stack[i].nim+"\t"+stack[i].name+"\t"+stack[i].className);
    }
    System.out.println("");
  }

  public Student08 firstSubmitted(){
    if (!isEmpty()){
      return stack[0];
    }else{
      System.out.println("There's no data in Stack!");
      return null;
    }
  }

  public int count(){
    return top+1;
  }

  public String convertToBinary(int grade){
    ConversionStack08 stack = new ConversionStack08();
    while (grade != 0) {
      int mod = grade % 2;
      stack.push(mod);
      grade = grade/2;
    }
    String binary ="";
    while (!stack.isEmpty()) {
      binary += stack.pop();
    }
    return binary;
  }
}