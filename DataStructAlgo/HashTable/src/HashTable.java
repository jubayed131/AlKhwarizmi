public class HashTable {
    private Employee[] hashtable;

    public HashTable(){
        hashtable=new Employee[10];
    }

    public void put(String key, Employee employee){
        int hashkey=getKey(key);
        if(hashtable[hashkey]!=null){
            System.out.println("There is already an element in hash table");
        }
        else{
            hashtable[hashkey]=employee;
        }
    }

    public Employee retrieveValue(String key){
        int hashKey=getKey(key);
        return hashtable[hashKey];
    }

    public int getKey(String key){
        return key.length()%hashtable.length;
    }

    public void hashTable(){
        for(int i=0;i<hashtable.length;i++){
            System.out.println(hashtable[i]);
        }
    }
}
