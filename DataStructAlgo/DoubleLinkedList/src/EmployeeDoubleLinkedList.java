public class EmployeeDoubleLinkedList {
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        if(head==null){
            tail=node;

        }else{
            node.setNext(head);
            head.setPrevious(node);
        }
        head=node;
        size++;
    }
    public void addToEnd(Employee employee){
        EmployeeNode node=new EmployeeNode(employee);
        if(tail==null){
            head=node;
        }else{
            node.setPrevious(tail);
            tail.setNext(node);
        }
        tail=node;
        size++;

    }
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
       return head==null;
    }
    public EmployeeNode removeNodeFromFront(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode=head;

        if(head.getNext()==null){

            tail=null;
        }
        else{
            head.getNext().setPrevious(null);
        }
        head=head.getNext();
        removedNode.setNext(null);
        size--;
        return removedNode;
    }

    public EmployeeNode removeNodeFromEnd(){
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode=tail;

        if(tail.getPrevious()==null){

            head=null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail=tail.getPrevious();
        removedNode.setPrevious(null);
        size--;
        return removedNode;
    }

    public void printList(){
        System.out.println(" -> HEAD");
        EmployeeNode current=head;
        while(current!=null){
            System.out.println("->"+current);
            current=current.getNext();

        }
        System.out.println("-> NULL");
    }
}
