package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("f");
        list.add("drr");
        list.add("eeeeef");
        list.add("fwwwvww");
        list.add("fttt");
        list.add("fhhhhh");
        System.out.println(list);
        System.out.println();
        list.removeIf(element->element.length()<5);
        System.out.println(list);
        Predicate<String> p=element->element.length()<7;
        list.removeIf(p);
        System.out.println(list);
        System.out.println();

    }
}
