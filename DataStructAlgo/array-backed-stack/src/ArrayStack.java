import java.util.EmptyStackException;

public class ArrayStack {
    private Employee[] stack;
    int top;

    public ArrayStack(int capacity){
        stack=new Employee[capacity];
    }

    public boolean isEmpty(){
        if(top==0){
            return true;
        }
        return false;
    }

    public void push(Employee employee){
        if(top==stack.length){
            Employee[] resizedArray=new Employee[2*stack.length];
            System.arraycopy(stack,0,resizedArray,0,stack.length);
            stack=resizedArray;
        }
        stack[top++]=employee;


    }
    public Employee pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        Employee employee=stack[--top];
        stack[top]=null;
        return employee;

    }
    public int size(){
        return top;
    }
    public Employee peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top-1];
    }

    public void printStack(){
        for(int i=top-1;i>=0;i--){
            System.out.println(stack[i]);
        }
    }
}
