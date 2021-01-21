package TimeComplexity;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    public static int solution(int[] A){
        //using of HashMap for ordering values
        Set incompleteSet=new HashSet();

        for(int i=0;i<A.length;i++){
            incompleteSet.add(A[i]);
        }

        for(int i=1;i<=A.length+1;i++){
            if(!incompleteSet.contains(i)){
               return i;
            }
        }
        throw new RuntimeException("Dismiss");
    }

    public static void main(String[] args){
        System.out.println(solution(new int[]{1,5,2,4,6,3}));
    }
}
