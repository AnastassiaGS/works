import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> values = new ArrayList<>();
        values.add(5);
        values.add(99);
        values.add(25);
        values.add(10);
        Massive massive1 = new Massive();

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Mars");
        strings.add("Sun");
        strings.add("Mercury");
        strings.add("Earth");
        Massive massive = new Massive();


        // 1. Find sum of all elements
        System.out.println(massive1.findSum(values));

        // 2. Display the array in reverse order
        System.out.println(massive1.printArrayReverse(values));


        //3. Replace max element
        System.out.println(massive.replaceElement(values));


        // 4. Find does array contains a certain word.
        System.out.println(massive.containsElement(strings));


        //5. Determine a size of an array.
        try {
            massive.calculateSize(strings);
        } catch (Exception e) {
            System.out.println("This list is empty" + e.getMessage());
        }
        System.out.println(massive.calculateSize(strings));





    }

}




