import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Massive  {

        private ArrayList<String> strings;
        private ArrayList<Integer> values;

        public Massive() {
        }

        // 1. Find sum of all elements
        public Integer findSum(ArrayList<Integer> values) {
            Integer sum = 0;
            for (Integer value : values) {
                sum = sum + value;
            }
            return sum;
        }

         // 2. Display the array in reverse order
        public ArrayList<Integer> printArrayReverse(ArrayList<Integer> values) {
            ArrayList<Integer> arrayReverse = new ArrayList<>(values);
            Collections.reverse(arrayReverse);
            return arrayReverse;
        }


    //3. Replace max element
    public ArrayList<Integer> replaceElement(ArrayList<Integer> values) {
            values.set(values.indexOf(Collections.max(values)), 35);
            return  values;
        }


    // 4. Find does array contains a certain word.
        public boolean containsElement(ArrayList<String> strings) {
            Arrays.asList(strings).stream().forEach(string -> string.equals("Sun"));
            return true;
        }

        //5. Determine a size of an array.
        public Integer calculateSize(ArrayList<String> strings) throws ArrayIndexOutOfBoundsException{
            Integer sizeList = strings.size();
            if ((strings.size() < 0)&&(strings.size()== 0)) {
                throw new ArrayIndexOutOfBoundsException (" ArrayList is empty");
            } else {
                return sizeList;
            }
        }


          }








