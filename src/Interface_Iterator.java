import java.util.ArrayList;
import java.util.Iterator;

public class Interface_Iterator {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Azim");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }

    }
}
