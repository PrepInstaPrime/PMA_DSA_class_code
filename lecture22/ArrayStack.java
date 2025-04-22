import java.util.Arrays;
import java.util.Arrays;
class CustomStack{
    private int arr[];
    private int top;
    private int capacity;
    CustomStack(int size){
        arr=new int[size];
        top=-1;
        capacity=size;
    }
    public void push(int ele){
        if(top==capacity-1){
            System.out.println("stack overflow");
        }else{
            top++;
            arr[top]=ele;
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }

        return arr[top--];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public int size(){
        return top+1;
    }
    public int peek(){
        if(top==-1){
            System.out.println("stack is empty");
            return -1;
        }else{
            return arr[top];
        }
    }
    public void display(){
        System.out.print("[");
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("]");
    }

}

public class ArrayStack {
    public static void main(String[] args) {
        CustomStack stack= new CustomStack(3);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.display();
        // deleting value from stack
        int del=stack.pop();
        System.out.print("delete value: "+del+" and updated stack");
        stack.display();
        // size of stack
        System.out.println("lenght of stack: "+stack.size());
        // check stack for empty
        System.out.println("is Empty: "+stack.isEmpty());
        // top value
        System.out.println("Peek value: "+stack.peek());

    }
}
