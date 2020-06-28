public class Main {
    public static void main(String[] args){
        Employee asad=new Employee(1,"Md.","Asaduzzaman");
        Employee atif=new Employee(2,"Atif bin","Karim");
        Employee rouf=new Employee(3,"Abdur","Rouf");
        Employee fiz=new Employee(4,"Mustafizur","Rahman");


        ArrayQueue queue=new ArrayQueue(5);

        queue.add(asad);
        queue.add(atif);
        queue.add(rouf);
        queue.remove();

        queue.add(asad);
        queue.remove();
        queue.add(fiz);
        queue.add(atif);


    }
}
