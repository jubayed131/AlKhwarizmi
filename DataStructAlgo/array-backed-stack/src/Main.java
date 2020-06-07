public class Main {
    public static void main(String[] args){
        ArrayStack stackOne=new ArrayStack(5);

        Employee asad=new Employee(1,"Md.","Asaduzzaman");
        Employee atif=new Employee(2,"Atif Bin","Karim");
        Employee rouf=new Employee(3,"Abdur","Rouf");
        Employee Arif =new Employee(4,"Mustafizur","Rahman");

        stackOne.push(asad);
        stackOne.push(atif);
        stackOne.push(rouf);
        stackOne.push(Arif);


        stackOne.printStack();
        System.out.println("-----------");
        stackOne.pop();
        stackOne.printStack();
        System.out.println("-----------");
        System.out.println(stackOne.peek());

    }
}
