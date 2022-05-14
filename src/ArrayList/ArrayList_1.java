package ArrayList;
import java.util.ArrayList;

public class ArrayList_1  {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Azim");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        System.out.println(arrayList1);
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("Nina");
        arrayList1.addAll(1,arrayList1);
        System.out.println(arrayList1);
        System.out.println(arrayList2);


    }
}
