public class InsertionSort{

    public static void main(String args[]){
        int[] intArray={22,-65,36,10,-34,67};

        for(int unsortedIndex=1; unsortedIndex < intArray.length; unsortedIndex++){

          int newElement=intArray[unsortedIndex];


            int i;
            for( i=unsortedIndex; i > 0 && intArray[i-1] > newElement; i--){

                intArray[i]=intArray[i-1];


            }

            intArray[i]=newElement;


        }

        for(int k=0; k < intArray.length;k++){

          System.out.println(intArray[k]);
        }


    }


}
