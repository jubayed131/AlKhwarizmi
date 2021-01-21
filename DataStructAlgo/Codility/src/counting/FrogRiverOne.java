package counting;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static int solution(int X, int[] A){

        Set<Integer> requiredHashset=new HashSet<>();
        for(int i=1;i<=X;i++){
            requiredHashset.add(i);
        }

        Set<Integer> currentHashset=new HashSet<>();

        for(int i=0; i<A.length;i++){
            currentHashset.add(A[i]);
            if(currentHashset.size()<requiredHashset.size()) continue;

            if(currentHashset.containsAll(requiredHashset)){
                return i;
            }


        }

        return -1;

    };

    public static void main(String[] args){
        System.out.println(solution(5,new int[]{1,3,1,4,2,3,5,4}));
        System.out.println(solution(4,new int[]{1,3,1,4,2,3,5,4}));
    }
}
