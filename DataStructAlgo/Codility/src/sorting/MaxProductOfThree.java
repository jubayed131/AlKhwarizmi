package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxProductOfThree {
    public static int solution(int[] A){
        //Not fully correct
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<A.length;i++){
            list.add(A[i]);
        }
        Collections.sort(list);


        return list.get(list.size()-1)*list.get(list.size()-2)*list.get(list.size()-3);
    }

    public static int solution1(int[] A) {
        List<Integer> aList = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            aList.add(A[i]);
        }
        Collections.sort(aList);

        int product1, product2, product3, product4 = 0;

        product1 = aList.get(0)*aList.get(1)*aList.get(2); //first 3 elements
        product2 = aList.get(aList.size()-3) * aList.get(aList.size()-2) * aList.get(aList.size()-1); //last 3 elements
        product3 = aList.get(0) * aList.get(1) * aList.get(aList.size()-1); //first 2 and last element
        product4 = aList.get(0) * aList.get(aList.size()-2) * aList.get(aList.size()-1); //first and last 2 elements

        int max1 = Math.max(product1, product2);
        int max2 = Math.max(product3, product4);

        return Math.max(max1, max2);
    }

    public static void main(String[] args){
        System.out.println(solution(new int[]{-3,1,2,-2,5,6}));
        System.out.println(solution1(new int[]{-3,1,2,-2,5,6}));
    }
}
