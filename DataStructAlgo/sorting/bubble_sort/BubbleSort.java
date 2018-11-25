public class BubbleSort{
  public static void main(String args[]){
      int[] array={22,45,-34,45,-10,79,89};

      for(int lastUnsortedIndex=array.length-1; lastUnsortedIndex>0;lastUnsortedIndex--){

        for(int i=0;i<lastUnsortedIndex;i++){

          if(array[i]>array[i+1]){

            swap(array, i,i+1);
          }
        }
      }


      for(int i=0; i<array.length;i++){

            System.out.println(array[i]);
      }

  }


  public static void swap(int[] array, int i,int j){
      int temp= array[i];
      array[i]=array[j];
      array[j]=temp;

  }


}
