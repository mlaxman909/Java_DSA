import java.util.Scanner;

public class input2Darrys {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.println("Enter size of row ");
        for (int i = 0; i < arr.length; i++) {


            arr[i] = input.nextInt();

        }
        for (int j : arr) {


            System.out.print(j + " ");
        }
         System.out.println( " ");
    }
}


