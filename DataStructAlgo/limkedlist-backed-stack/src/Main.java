public class Main {
    public static void main(String[] args){
        Employee asad=new Employee(1,"Md. ","Asaduzzaman");
        Employee Atif=new Employee(2,"Atif Bin","Karim");

        LinkedStack linkedStack=new LinkedStack();
        linkedStack.push(asad);
        linkedStack.push(Atif);

        linkedStack.printStack();
        linkedStack.pop();

        linkedStack.printStack();

    }
}
