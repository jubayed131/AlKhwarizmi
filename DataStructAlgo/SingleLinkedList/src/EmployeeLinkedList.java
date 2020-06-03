public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addFrontNode(Employee employee){
        EmployeeNode node= new EmployeeNode(employee);
        node.setNext(head);
        head=node;
        size++;
    }
    public boolean isEmpty(){

        if (size==0){
            return false;
        }else return true;
    }

    public EmployeeNode removeFromFront(){
        if(!isEmpty()){
            return null;
        }
        EmployeeNode removedNode=head;
        head=head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;

    }
    public int getSize(){
        return size;
    }

    public void printList(){
        EmployeeNode current=head;
        while (current != null){
            System.out.println(current);
            current=current.getNext();
        }
    }


}
