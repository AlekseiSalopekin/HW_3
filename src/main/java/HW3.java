import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class HW3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();


        Random rnd = new Random();

        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(20));
        }

        for (int i = 0; i < 20; i++) {
            list2.add(rnd.nextInt(20));
        }

        list.forEach(n -> System.out.print(n+" ") );
        System.out.println();
        list2.forEach(n -> System.out.print(n+" ") );
        System.out.println();

        list.removeAll(list2);
        list.forEach(n -> System.out.print(n+" "));

        Collections.sort(list);
        System.out.println();
        System.out.println(list);

        list2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(list2);

    }
}
