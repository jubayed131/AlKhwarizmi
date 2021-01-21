package arrays;

public class CyclicRotationSelf {

public static int[] solution(int[] A, int k){

        int[] B=new int[A.length];

        for(int i=0;i<A.length;i++){
            int rotatedIndex=(i+k)%A.length;
            B[rotatedIndex]=A[i];

        }
        return B;

    }

    public static void main(String[] args){
        System.out.println(solution(new int[]{5,4,3},2)[2]);

    }

}
