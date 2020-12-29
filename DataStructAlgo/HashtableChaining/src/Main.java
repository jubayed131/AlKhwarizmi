public class Main {
    public static void main(String[] args){
        Employee asad=new Employee(1,"Md. ","Asaduzzaman");
        Employee rouf=new Employee(2,"Abdur","Rouf");
        Employee atif=new Employee(3,"Md. Atif Bin","Karim");
        Employee fiz=new Employee(4,"Mustafizur","Rahman");
        Employee shamil=new Employee(5,"Mir Salman","Shamil");

        ChainedHashtable ht=new ChainedHashtable();
        ht.put("asad",asad);
        ht.put("shamil",shamil);
        ht.put("fiz",fiz);
        ht.put("rouf",rouf);
        ht.put("atif",atif);

        ht.printHashTable();
        System.out.println("Retrieval of rouf"+ht.get("rouf"));
        System.out.println(ht.remove("atif"));
        ht.printHashTable();
    }
}
