package counting;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static int solution(int[] A){
        Set<Integer> requiredSet=new HashSet<>();
        Set<Integer> currentSet=new HashSet<>();

        for(int i=0;i<A.length;i++){
            requiredSet.add(i+1);
            currentSet.add(A[i]);

        }
        if(requiredSet.containsAll(currentSet)){
            return 1;
        }

        return 0;
    }
    public static void main(String[] args){
        System.out.println(solution(new int[]{1,3,4,5}));
        System.out.println(solution(new int[]{1,3,4,2}));
    }
}
