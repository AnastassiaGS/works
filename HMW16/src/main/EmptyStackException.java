package Mine;

public class EmptyStackException extends MyException {


    private String detail;



    public EmptyStackException(String detail){
        super(detail);
    }

    @Override
    public String getMessage()

    {
        return "MyExeptionOne: got an error" + detail;
    }
}
