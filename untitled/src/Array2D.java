import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] a= new int[3][3];
        Scanner in = new Scanner(System.in);

        for (int row= 0; row < a.length; row++){
            for (int col =0; col<a[row].length;col++){
                a[row][col]= in.nextInt();

            }
        }
        for (int row= 0; row < a.length; row++){
            for (int col =0; col<a[row].length;col++){
               System.out.print(a[row][col]+ " ");

            }
            System.out.println();
        }





    }
}
