package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        // Add elements to array list
        list.add(6);
        list.add(7);
        System.out.println(list);

        //Itterate over elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //Itterate over using enhanced
        for (Integer i : list) {
            System.out.println(i);
        }

        //stream
        list.stream().forEach(System.out::println);

        // Iterator traversal
        java.util.Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Delete from array list
        list.remove(2);

        // Search in array list
        if (list.contains(3)) {
            System.out.println("Value 3 found in the list");
        } else {
            System.out.println("Value 3 not found in the list");
        }
    }
}