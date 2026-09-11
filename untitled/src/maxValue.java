import java.util.Arrays;
import java.util.Scanner;

public class maxValue {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


        int[] arr = {1, 2, 33, 4, 5};


        System.out.println(fun(arr));
        System.out.println(fun(arr,1,4));



    }

     public static int fun(int[] arr) {
         int maxval = arr[0];
         for (int i = 0;i < arr.length; i++) {
             if (arr[i] > maxval) {
                 maxval = arr[i];
             }

         }
         return maxval;
     }

    public static int fun(int[] arr,int start,int end) {
        int maxval = start;
        for (int i = start;i < end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];
            }

        }
        return maxval;
    }
}
