
public class FixedSizeArrayStack{

    // Length of the array used to implement the stack
    protected int capacity;


    //Array uded to implement the stack
    protected int[] stackRep;

    //index of the top element of the stack in the array
    protected int top=-1;


    //Initialilzes the stack to use an array of given length
    public FixedSizeArrayStack(int capacity){
        this.capacity=capacity;
        this.stackRep=new int[capacity];

    }
    //Returns the numbers of elements of in the stack. This method runs in O(1) time
    public  int size(){
        return (top+1);
    }

    //Whether the stack is empty
    public  boolean isEmpty(){
        return (top<0);
    }
    //Inserts an element at the top of the stack. this methodruns O(1) times
    public  void push(int data) throws Exception{
        if(size()==capacity)
            throw new Exception("Stack is full");
        stackRep[++top]=data;
    }
    //Inspects the element at the top of the stack. This method runs in O(1) times
    public int top() throws Exception{
        if(isEmpty())
            throw new Exception("Stack is Empty");
        return stackRep[top];
    }
    //Removes the top element from the stack . This method runs O(1) time
    public  int pop() throws Exception{
        int data;
        if(isEmpty())
            throw new Exception("Stack is empty");
        data=stackRep[top];
        stackRep[top--]=Integer.MIN_VALUE;
        return data;
    }
    //Returns a string representaion of the stack as a list of elements,

    public  String toString(){
        String s;
        s="[";
        if(size()>0)
            s+=stackRep[0];
        if(size()>1)
            for(int i=1; i<=size()-1; i++){
                s+=", "+stackRep[i];
            }
        return s +"]";
    }

    public static void main(String[] args) throws Exception{
        FixedSizeArrayStack fixedSizeArrayStack=new FixedSizeArrayStack(10);
        fixedSizeArrayStack.push(29);
        fixedSizeArrayStack.push(28);
        fixedSizeArrayStack.push(18);
        System.out.println("List of the stack"+fixedSizeArrayStack.toString());
        System.out.println("Size of the stack"+fixedSizeArrayStack.size());
        System.out.println("Empty?"+fixedSizeArrayStack.isEmpty());
        System.out.println("Top of the stack"+fixedSizeArrayStack.top());
        System.out.println("Pop of the stack"+fixedSizeArrayStack.pop());
        System.out.println("After doing pop"+fixedSizeArrayStack.toString());
        System.out.println("Another Pop "+fixedSizeArrayStack.pop());
        System.out.println("Another pop "+fixedSizeArrayStack.pop());
        System.out.println("After doing pop"+fixedSizeArrayStack.toString());
        System.out.println("Empty? "+fixedSizeArrayStack.isEmpty());



    }
}