package TimeComplexity;

public class TapeEquillibrium {
    public static int solution(int[] A){
        long sumOfAllelements=0;
        for (int i=0;i<A.length;i++){
            sumOfAllelements+=A[i];
        }

        int minDifference=Integer.MAX_VALUE;
        int currentDifference=Integer.MAX_VALUE;

        long sumOfFirstPart=0;
        long sumOfSecondPart=0;

        for(int i=0;i<A.length-1;i++){
            sumOfFirstPart+=A[i];
            sumOfSecondPart=sumOfAllelements-sumOfFirstPart;
            currentDifference=(int)Math.abs(sumOfFirstPart-sumOfSecondPart);
            minDifference=Math.min(currentDifference,minDifference);
        }

        return minDifference;



    }

    public static void main(String[] args){

        System.out.println(solution(new int[]{3,1,2,4,3}));
    }
}
