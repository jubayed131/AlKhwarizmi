public class Main {
    public static void main(String[] args) {
        Employee atif = new Employee(1, "Md Atif Bin", "Karim");
        Employee rouf = new Employee(2, "Abdurr", "Rouf");
        Employee asad = new Employee(3, "Md.", "Asaduzzaman");
        Employee fiz = new Employee(4, "Mustafizur", "Rahman");
        Employee abdullah = new Employee(5, "Abdullah", "Al Noman");

        HashtableLinearProbing ht = new HashtableLinearProbing();
        ht.put("atif",atif);
        ht.put("fiz",fiz);
        ht.put("abdullah",abdullah);
        ht.put("rouf",rouf);
        ht.put("asad",asad);

        ht.printHashtable();

        System.out.println("Retrieving hash elemen"+ ht.get("fiz"));
        System.out.println(ht.remove("rouf"));

        ht.printHashtable();

        System.out.println("Retrieving hash element"+ ht.get("asad"));



    }
}
