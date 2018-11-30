public class SelectionSort{
  public static void main(String args[]){
      int[] array={22,45,-34,45,-10,79,89};

      for(int lastUnsortedIndex=array.length-1; lastUnsortedIndex>0;lastUnsortedIndex--){
          int largest=0;
        for(int i=1;i<=lastUnsortedIndex;i++){ // if we don't put equal signS

          if(array[i]>array[largest]){
            largest=i;

          }
        }

        swap(array,lastUnsortedIndex, largest);
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
