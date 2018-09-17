package Mine;

import java.util.List;

public class Dropdown implements Comparable<Dropdown> {

    public String name;
    private List<String> options;
    private boolean isSelected;



    public Dropdown(List<String> options, boolean isSelected, String name){
        this.options = options;
        this.isSelected=isSelected;
        this.name=name;
    }

    @Override
    public String toString (){
        return  "A name of a label: " + name;
    }
    public String asString()
    {
        return name;
    }


    @Override
        public int compareTo(Dropdown obj) {
        Dropdown objectToCompare = obj;
        int result = name.compareTo(objectToCompare.name);
     /*   if (result != 0) {

            result = result / Math.abs(result);
        }*/
        return result;
    }

}

