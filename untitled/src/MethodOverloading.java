public class MethodOverloading {
    public static void main(String[] args) {
        int ans =fun(34,53);
        System.out.println(ans);

    }

    static  int fun(int a,int b){
        return a +b;

    }
    static  int fun(int a,int b,int c){
        return a +b+c;

    }
}
