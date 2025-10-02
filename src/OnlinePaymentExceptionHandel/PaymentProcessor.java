package OnlinePaymentExceptionHandel;

public class PaymentProcessor {
    public void processPayment(double amount) throws LimitExceededException, IllegalAccessException {
        if (amount<0){
            throw new IllegalAccessException("Amount is negative");
        }
        if (amount>10000){
            throw new LimitExceededException("Limit");
        }
        System.out.println("Payment Successful: "+amount);
    }
}
