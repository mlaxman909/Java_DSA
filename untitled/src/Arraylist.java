import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        System.out.print(list);

        list.add(0,4);
        System.out.print(list);
        list.remove(2);
        System.out.print(list);
        System.out.print(list.contains(2));
    }


}
