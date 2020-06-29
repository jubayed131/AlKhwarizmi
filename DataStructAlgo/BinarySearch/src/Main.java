
public class Main {
    public static void main(String[] args){
        int[] numbers={-22,-4,5,30,46,105,208};
        System.out.println(binarySearch(numbers, 208));
        System.out.println(binarySearch(numbers, 100));
        System.out.println(binarySearch(numbers, -22));

        System.out.println(recursiveBinarySearch(numbers, 105));


    }
    static int binarySearch(int[] numbers,int number){
        int start=0;
        int end=numbers.length;

       while(start<end) {
           int midpoint = (start + end) / 2;
           if(numbers[midpoint]==number){
               return midpoint;
           }else if(numbers[midpoint]<number){
               start=midpoint+1;
           }else{
               end=midpoint;
           }

       }
        return -1;
    }
    static int recursiveBinarySearch(int[] numbers, int number){
        return recursiveBinary(numbers,0,numbers.length,number);
    }

    static int recursiveBinary(int[] numbers,int start,int end,int number){
        int midpoint=(start+end)/2;
        if(start>=end){
            return -1;
        }

        if(numbers[midpoint]==number){
            return midpoint;
        }
        else if (numbers[midpoint]<number) {

            return recursiveBinary(numbers, midpoint + 1, end, number);

        }else{

            return recursiveBinary(numbers,start,midpoint,number);

            }
        }

    }


