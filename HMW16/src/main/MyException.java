package Mine;

public class MyException extends Exception {


    private  String detail;

    public MyException(String detail){

        this.detail=detail;
    }



    @Override
    public String getMessage()

    {
        return "MyExeption: You've got an error" + detail;
    }


}
