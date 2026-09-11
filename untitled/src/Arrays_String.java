import java.util.Arrays;
import java.util.Scanner;

public class Arrays_String {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner in = new Scanner(System.in);

        String[] str = new String[5];

        for (int i =0; i<str.length; i++){
            str[i] =in.nextLine();
        }
        for (String num : str){
            System.out.print(num + " ");
        }
        System.out.print(Arrays.toString(str));
        //modify
        str[3]="new";
        System.out.print(Arrays.toString(str));
    }
}
