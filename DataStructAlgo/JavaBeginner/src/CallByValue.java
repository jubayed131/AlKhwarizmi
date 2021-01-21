public class CallByValue {
    public static void main(String[] args){

        // Cal by value primitive
        int value=4;

        System.out.println("1. value "+ value);
        show(value);
        System.out.println("4. Value "+ value);

        //call by value non-primitive

        Person person=new Person(1,"Alex");
        System.out.println("Person 1:" +person );
        show(person);
        System.out.println("Person 4:" +person );

    }
    public static void show(int value){
        System.out.println("2. Value "+value);
        value++;
        System.out.println("3. Value "+ value);
    }

    public static void show(Person person){
        System.out.println("Person 2:" +person );
        person.setName("Rick");
        person=new Person(3,"Bob");
        //person.setName("Rick");
        System.out.println("Person 3"+person);
    }
}
