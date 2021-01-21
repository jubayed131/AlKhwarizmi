package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Triangle {
    public static int solution(int[] A){
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<A.length;i++){
            list.add(A[i]);
        }
        Collections.sort(list);
        for(int i=0;i<list.size()-3;i++){
            if(list.get(i)+list.get(i+1)>list.get(i+2)){
                return 1;
            }
        }
        return 0;
    }
    public static int solution1(int[] A){
        if(A.length < 3) return 0;

        List<Integer> aList = new ArrayList<>();
        for(int i=0; i<A.length; i++)
            {
                aList.add(A[i]);
            }
        Collections.sort(aList);
        //made long array because each int element
        // can be as high as Integer.MAX_VALUE so when add them can overflow int
        long[] aOrdered = new long[A.length];
        int index = 0;
        for(Integer i : aList)
         {
             aOrdered[index++] = i;
         }
         //start from the end (largest) if previous 2 elements have
        // sum > current element, found a triangle
        for(int i=aOrdered.length-1; i>=2; i--) {
            if(aOrdered[i-1] + aOrdered[i-2] > aOrdered[i]) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(solution(new int[]{10,2,5,1,8,20}));
        System.out.println(solution(new int[]{10,50,5,1}));
    }


}
