public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person obj) {
        Person objectToCompare = obj;
        int result = name.compareTo(objectToCompare.name);
        if (result != 0) {

            return result;
        }
        return 0;
    }




   @Override
    public String toString (){
        return  "Person: " + name +", " +  age;
    }


}