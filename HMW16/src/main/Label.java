package Mine;

public class Label implements Comparable {

    private String name;

    public Label(String name){
        this.name=name;
    }




    @Override
    public String toString (){
        return  name;
    }
    public String asString()
    {
        return name;
    }

    @Override
    public int compareTo(Object label){
        Label objectToCompare = (Label) label;
        int result= this.name.compareTo(objectToCompare.name);
        if (result!=0){
        return  result;
        }
        return 0;
      }
}

