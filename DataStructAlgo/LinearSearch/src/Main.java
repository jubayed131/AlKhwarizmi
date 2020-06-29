public class Main {
    public static void main(String[] args){

        int[] numbers={12,-44,3,50,67,-30};
         System.out.println(linearSearch(numbers,50)); ;
    }
    static int linearSearch(int[] numbersArray, int number){
        for(int i=0;i<numbersArray.length;i++){
            if(numbersArray[i]==number){
                return i;
            }
        }

            return 0;

    }
}
