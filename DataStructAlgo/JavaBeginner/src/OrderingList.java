import java.util.*;


class StringLengthOrder implements Comparator<String> {


     @Override
     public int compare(String o1, String o2) {
         int len1=o1.length();
         int len2=o2.length();

         if(len1>len2){
             return 1;
         }else if(len1<len2){
             return -1;
         }
         return 0;
     }
 }
class AlphabeticOrder implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

class ReverseAlphabeticOrder implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}





public class OrderingList {
    public static void main(String[] args){
        List<String> stringList=new ArrayList<String>();

        stringList.add("cat");
        stringList.add("tiger");
        stringList.add("elephent");
        stringList.add("dog");
        stringList.add("lion");
        stringList.add("kangaroo");

        Collections.sort(stringList,new ReverseAlphabeticOrder());

        for(String animal:stringList){
            System.out.println(animal);
        }


        List<Integer> integerList=new ArrayList<Integer>();

        integerList.add(4);
        integerList.add(5);
        integerList.add(41);
        integerList.add(89);
        integerList.add(47);

        Collections.sort(integerList);

        for(Integer number:integerList){
            System.out.println(number);
        }

        Collections.sort(integerList, new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                return -int1.compareTo(int2);
            }
        });

        for(Integer number:integerList){
            System.out.println(number);
        }

        List<Person> personList=new ArrayList<Person>();
        Set<Person> personSet=new TreeSet<Person>();

        personList.add(new Person(1,"John"));
        personList.add(new Person(2,"Bob"));
        personList.add(new Person(3,"Clarke"));
        personList.add(new Person(7,"Hercules"));

        personSet.add(new Person(2,"akkas"));
        personSet.add(new Person(4,"Bakkas"));

       // Collections.sort(personList);
       // Collections.sort(personSet);

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {

                int p1_id=p1.getId();
                int p2_id=p2.getId();

                if(p1_id>p2_id){
                    return 1;
                }else if(p1_id<p2_id){
                    return -1;
                }return 0;

            }
        });

        for(Person person: personList){
            System.out.println(person);
        }


    }
}
