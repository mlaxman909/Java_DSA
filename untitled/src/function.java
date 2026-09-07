import java.util.Scanner;

public class function {
    public static void main(String[] args) {

      sum();
      int ans = sum2( 20, 23);
      System.out.println(ans);

        }
      static void sum(){
          Scanner in = new Scanner(System.in);

          System.out.println("enter the number 1 :");
          int num1 = in.nextInt();
          System.out.println("enter the number 2 :");
          int num2 = in.nextInt();
          int sum = num1 +num2;
          System.out.println("the sum =" + sum);
      }
      static int  sum2(int a,int b){
        int sum = a+b;
        return  sum;
      }

}
