import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter the number 2:");
        int num2 = sc.nextInt();
        System.out.println("enter the number 3:");
        int num3 = sc.nextInt();
        int max=0;

        if(max<num1){
            max=num1;
        }
        if(max<num2){
            max=num2;
        }
        if(max<num3){
            max=num3;
        }

        System.out.println("the largest number is : " +max);





    }
}