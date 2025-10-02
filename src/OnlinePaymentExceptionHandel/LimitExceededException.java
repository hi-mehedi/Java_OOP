package OnlinePaymentExceptionHandel;

public class LimitExceededException extends Exception{
    public LimitExceededException(String msg){
        super(msg);
    }
}
