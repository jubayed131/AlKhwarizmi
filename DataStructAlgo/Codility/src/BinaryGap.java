import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    public static int solution(int N){
        String binaryStr=Integer.toBinaryString(N);
        List<Integer> onesList=new ArrayList();

        int longestBinaryGap=0;

        for(int i=0;i<binaryStr.length();i++){
            if(binaryStr.charAt(i)=='0') continue;
            onesList.add(i);
        }

        for(int i=0;i<onesList.size()-1;i++){
            int indicesDifference=onesList.get(i+1)-onesList.get(i)-1;

            longestBinaryGap=Math.max(longestBinaryGap,indicesDifference);

        }
        return longestBinaryGap;

    }

    public static void main(String args[]){
        System.out.println(solution(35));
        System.out.println(solution(1003));
        System.out.println(solution(529));
        System.out.println(solution(9));
    }
}
