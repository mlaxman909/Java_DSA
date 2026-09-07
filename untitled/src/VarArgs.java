import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun("laxman");
    }
    static void fun(int a ,int b, String...hello){
        System.out.println(Arrays.toString(hello));
    }
    static void fun( String...hello){
        System.out.println(Arrays.toString(hello));
    }
    static void fun(int ...hello){
        System.out.println(Arrays.toString(hello));
    }

}
