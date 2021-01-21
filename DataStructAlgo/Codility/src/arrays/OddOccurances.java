package arrays;

import java.util.HashMap;
import java.util.Set;

public class OddOccurances {
    public static int solution(int[] A){
        //Using of HashMap and storing integer values in Keys and
        // occurences in values
        HashMap<Integer,Integer> occurancesMap=new HashMap<Integer,Integer>();

        for(int i=0;i<A.length;i++){
            if(occurancesMap.containsKey(A[i])){
                int occurence=occurancesMap.get(A[i]);
                occurence++;
                occurancesMap.put(A[i],occurence);

            }else{
                occurancesMap.put(A[i],1);
            }
        }
        Set<Integer> keySet=occurancesMap.keySet();

        for( int currentKey:keySet){
            int occurence=occurancesMap.get(currentKey);
            if(occurence%2!=0){
                return currentKey;
            }
        }


       throw new RuntimeException("dismiss");
    }
    public static void main(String args[]){
        System.out.println(solution(new int[]{2,5,2,5,9}));
    }
}
