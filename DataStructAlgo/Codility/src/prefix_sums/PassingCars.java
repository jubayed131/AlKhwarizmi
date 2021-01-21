package prefix_sums;

public class PassingCars {
    public static int solution(int[] A){

        int pairs=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                for(int j=i+1;j<A.length;j++){
                    if(A[j]==1){
                        pairs++;
                    }
                }
            }


        }

        if(pairs<1000000000){
            return pairs;
        }
        return -1;
    }


    public static int solutionFunnel(int[] A) {
        int zeros = 0;
        int carPasses = 0;

        for(int i=0; i<A.length; i++) {
            if(A[i] == 0) {
                zeros++;
            }
             else if(A[i] == 1) {
                 //for every 1 - there will be an extra car pass for ALL the 0's that came before it
                  carPasses += zeros;
                  if(carPasses > 1000000000) {
                    return -1;
                  }
              }
             else throw new RuntimeException("shouldn't reach here");
         }
        return carPasses;
    }


    public static void main(String[] args){

        //Both solutios are correct but first one scored 50% becuase of low efficeincey
        // In second one there is onle one loop used
        System.out.println(solution(new int[]{0,1,0,1,1}));
        System.out.println(solutionFunnel(new int[]{0,1,0,1,1}));
    }
}
