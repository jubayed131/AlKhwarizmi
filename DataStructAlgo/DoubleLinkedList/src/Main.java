public class Main {
    public static void main(String[] args){

        Employee asad=new Employee(1,"MD.","Asaduzzaman");
        Employee rouf=new Employee(2,"Abdur","Rouf");
        Employee atif=new Employee(3,"Atif bin","Karim");
        Employee mustafiz=new Employee(4,"Mustafizur","Rahman");

        EmployeeDoubleLinkedList list=new EmployeeDoubleLinkedList();
        list.addToFront(asad);
        list.addToFront(rouf);


        System.out.println(list.isEmpty());

        System.out.println(list.getSize());



        list.addToEnd(mustafiz);
        list.printList();
        list.addToFront(atif);
        list.printList();
        list.removeNodeFromFront();
        list.printList();
        list.removeNodeFromEnd();
        list.printList();



    }

}
