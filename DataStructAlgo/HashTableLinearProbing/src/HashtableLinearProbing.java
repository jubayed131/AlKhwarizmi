public class HashtableLinearProbing {
    private StoredEmployee[] hashtable;
    public HashtableLinearProbing(){
        hashtable=new StoredEmployee[10];
    }

    public void put(String key, Employee employee){
        int hashedKey=getKey(key);

        if(occupied(hashedKey)){
            int stopKey=hashedKey;
            if(hashedKey==hashtable.length-1){
                hashedKey=0;
            }else{
                hashedKey++;
            }

            while(occupied(hashedKey)&& hashedKey!=stopKey){
                hashedKey=(hashedKey+1)%hashtable.length;
            }

        }

        if(occupied(hashedKey)){
         System.out.println("Position for "+ key + " is occupied");

        }
        else{
            hashtable[hashedKey]=new StoredEmployee(key,employee);
        }
    }

    public Employee remove(String key){
        int hashedKey=findKey(key);
        if(hashedKey==-1){
            return null;
        }else{
            Employee employee=hashtable[hashedKey].employee;
            hashtable[hashedKey]=null;
            StoredEmployee[] oldHashtable=hashtable;

            hashtable=new StoredEmployee[oldHashtable.length];

            for(int i=0;i<oldHashtable.length;i++){
                if(oldHashtable[i]!=null){
                    put(oldHashtable[i].key,oldHashtable[i].employee);
                }
            }

            return employee;
        }
    }

    public Employee get(String key){
        int hashedKey=findKey(key);
        return hashtable[hashedKey].employee;
    }

    private int findKey(String key){
        int hashedKey=getKey(key);
        if(hashtable[hashedKey]!=null &&
            hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }


        int stopKey = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while ( hashtable[hashedKey]!=null &&
                hashedKey!=stopKey &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        if(hashtable[hashedKey]!=null &&
            hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        else{

            return -1;
        }

    }

    public int getKey(String key){
      return key.length()%hashtable.length;
    }

    public boolean occupied(int index){

        return hashtable[index]!=null;
    }

    public void printHashtable(){
        for(int i=0;i<hashtable.length;i++){
            if(hashtable[i]==null){
                System.out.println("empty");
            }else{
                System.out.println("Position at "+i+" : "+hashtable[i].employee);
            }
        }
    }
}
