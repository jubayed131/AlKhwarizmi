import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistVsLinkedlist {
    public static void main(String[] args){
        List<Integer> arrayList=new ArrayList<Integer>();
        List<Integer> linkedList=new LinkedList<Integer>();

        doTimings("Arraylist",arrayList);
        doTimings("LinkedList",linkedList);

        // In Arraylist inserting elements at the start of list consumes more time.
        // If at the end to the Arraylist elements are inserted than it need less time
        // When adding at the start or middle of the list, LinkedList is better
        // For traversing ArrayList is better.
        //  Normally ArrayList is used

    }


    public static void doTimings(String type,List<Integer> list){

        for(int i=0; i<1E5;i++){
            list.add(i);
        }

        long startTime=System.currentTimeMillis();

        for(int i=0; i<1E5;i++){
            list.add(list.size()-1,i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Time required for "+type+" "+(endTime-startTime));
    }
}
