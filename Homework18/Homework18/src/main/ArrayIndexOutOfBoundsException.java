package Mine;

public class ArrayIndexOutOfBoundsException extends MyException {

    private String detail;


    public ArrayIndexOutOfBoundsException(String detail){
        super(detail);

    }

    @Override
    public String getMessage()

    {
        return "MyExeptionTwo: had an error" + detail;
    }
}
