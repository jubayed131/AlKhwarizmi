public class Recursion{

  public static void main(String args[]){

      System.out.println(recursionFactorial(10));


  }
  static int recursionFactorial(int n){

      if(n==0){
        return 1;
      }

      return n*recursionFactorial(n-1);

  }
}
