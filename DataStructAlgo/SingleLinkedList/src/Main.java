public class Main {
    public static void main(String args[]){
        Employee jessy=new Employee(123,"Jessy","Pinkman");
        Employee white=new Employee(345,"Walter","White");
        Employee gus=new Employee(1333,"Gus","Fing");
        Employee saul=new Employee(333,"Saul","paolo");


        EmployeeLinkedList list=new EmployeeLinkedList();
        list.addFrontNode(jessy);
        list.addFrontNode(white);
        list.addFrontNode(gus);
        list.addFrontNode(saul);

        list.printList();
        System.out.println(list.getSize());
        list.removeFromFront();
        list.printList();
    }
}
