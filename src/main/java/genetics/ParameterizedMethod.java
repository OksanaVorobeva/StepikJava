package genetics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        int a = GenMethod.getSecondElement(arrayList);
        System.out.println(a);


        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("jjj");
        arrayList1.add("jddj");
        arrayList1.add("ggjj");

        String s = GenMethod.getSecondElement(arrayList1);
        System.out.println(s);
    }

}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}



