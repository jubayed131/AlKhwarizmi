public class Main {

    public static void main(String[] args){
        Employee atif=new Employee(1,"Atif BIn","Karim");
        Employee asad=new Employee(2,"Md.","Asaduzzaman");
        Employee rouf=new Employee(3,"Abdur","Rouf");
        Employee fiz=new Employee(4,"Mustafizur","Rahman");

        HashTable hashTable1=new HashTable();

        hashTable1.put("atif",atif);
        hashTable1.put("fiz",fiz);
        hashTable1.put("Asaduzzaman",asad);


        hashTable1.hashTable();

        System.out.println(hashTable1.retrieveValue("fiz"));
    }
}
