public class Text implements Comparable<Object>{

    private String name;

    public Text(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "String " + name;
    }

    @Override
    public int compareTo(Object string) {
        Text objectToCompare = (Text) string;
        int result = name.compareTo(objectToCompare.name);

        if (result != 0) {
            return result;
        }
        return 0;

    }
}
