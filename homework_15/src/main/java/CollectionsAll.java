import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionsAll {
    public static void main(String[] args) {


        HashMap<Integer, Person> personHashMap = new HashMap<>();
        Person person1 = new Person("Kevin", 26);
        Person person2 = new Person("Jaclin", 24);
        Person person3 = new Person( "Kelly", 25);
        personHashMap.put(1, person1);
        personHashMap.put(2, person2);
        personHashMap.put(3, person3);

        Set<Map.Entry<Integer, Person>> iter = personHashMap.entrySet();

        while (iter.hasNext());
        {
            System.out.println(iter.next().toString());
        }
        Iterator<HashMap<Integer, Person>> hashMapIterator = personHashMap.iterator;

        System.out.println(personHashMap + "; ");



}
}
