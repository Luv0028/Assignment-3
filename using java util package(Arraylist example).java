


// 22. Using java.util Package (ArrayList Example)
import java.util.ArrayList;
import java.util.Collections;
class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}








