import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredEmployee>[] hashTable;

    public ChainedHashtable(){
        hashTable=new LinkedList[10];
        for(int i=0;i<hashTable.length;i++){
            hashTable[i]=new LinkedList<StoredEmployee>();
        }
    }

    public void put(String key, Employee employee){
        int hashedKey=haskKey(key);

        hashTable[hashedKey].add(new StoredEmployee(key,employee));
    }
    public Employee get(String key){
        int hashedKey=haskKey(key);
        StoredEmployee employee=null;
        ListIterator<StoredEmployee> iterator=hashTable[hashedKey].listIterator();
        while(iterator.hasNext()){
            employee=iterator.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }

        }
        return null;
    }
    public Employee remove(String key){
        int hashedKey=haskKey(key);
        StoredEmployee employee=null;
        int index=-1;
        ListIterator<StoredEmployee> iterator=hashTable[hashedKey].listIterator();
        while(iterator.hasNext()){
            employee=iterator.next();
            index++;
            if(employee.key.equals(key)){
                break;
            }

        }
        if(employee==null || !employee.key.equals(key)){
            return null;
        }
        else{
            hashTable[hashedKey].remove(index);
            return employee.employee;
        }


    }

    private int haskKey(String key){
        return key.length() % hashTable.length;
    }
    public void printHashTable(){
        for(int i=0;i<hashTable.length;i++){
            if(hashTable[i]==null){
                System.out.println("Position at "+i+" is empty");
            }else{
                ListIterator<StoredEmployee> listIterator=hashTable[i].listIterator();
                System.out.print("Position at "+i+" is ->");
                while(listIterator.hasNext()){
                    System.out.print(listIterator.next().employee);
                    System.out.print("->");
                }
                System.out.println("null");

            }
        }
    }
}
