import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        Employee asad=new Employee(1,"Md. ","Asaduzzaman");
        Employee rouf=new Employee(2,"Abdur ","Rouf");
        Employee atif=new Employee(3,"Atif BIn ","Karim");
        Employee fiz=new Employee(4,"Mustafizur ","Rahman");

        LinkedList<Employee> list=new LinkedList<>();
        list.addFirst(asad);
        list.addFirst(rouf);
        list.addFirst(atif);

        iterating(list);
        list.add(fiz);
        iterating(list);

        list.remove();// From front willl be removed
        iterating(list);

        list.removeLast();
        iterating(list);



    }

         public static void iterating(LinkedList<Employee> list){
           Iterator iter=list.iterator();
                System.out.println("HEAD");
                while(iter.hasNext()){
                System.out.println(iter.next());

            }
                System.out.println("Null");
            }
}
