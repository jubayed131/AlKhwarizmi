package TimeComplexity;

public class FrogImpl {
    public static int solution(int X, int Y, int D){
        int distance=Y-X;
        int jumps=distance/D;
        if((distance%D)>0){
            jumps++;
        }
        return jumps;

    }

    public static void main(String args[]){
        System.out.println(solution(10,85,30));
    }

}
