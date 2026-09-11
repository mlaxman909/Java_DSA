import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] a){

        a[0]=99;
        a[4]=94;
    }
}
