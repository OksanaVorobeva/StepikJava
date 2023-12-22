package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) ->
                accumulator * element).get();
        System.out.println(result);

        int result2 = list.stream().reduce(1, (accumulator, element) ->
                accumulator * element);
        System.out.println(result2);

        List<String> list2 = new ArrayList<>();
        list2.add("privet");
        list2.add("kak dela");
        list2.add("OK");
        list2.add("poka");
        String result3 = list2.stream().reduce((a, e) ->
                a + " " + e).get();
        System.out.println(result3);


        List<Integer> list1 = new ArrayList<>();
        Optional<Integer> o = list1.stream().reduce((accumulator, element) ->
                accumulator * element);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("Not present");
        }
    }
}
