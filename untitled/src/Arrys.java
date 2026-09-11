import java.util.Arrays;
import java.util.Scanner;

public  class Arrys {
    public static void main(String[] args) {
        System.out.println("enter the number");
        int[] ar = new int[5];
        Scanner sc =new Scanner(System.in);

        for (int i =0; i<ar.length;i++){
             ar[i]=sc.nextInt();
        }
        for (int num: ar) {
            System.out.print(num + " ");
        }

        System.out.println(Arrays.toString(ar));
    }
}