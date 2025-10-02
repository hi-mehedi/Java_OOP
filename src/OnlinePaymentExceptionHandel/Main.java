package OnlinePaymentExceptionHandel;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
         try {
             paymentProcessor.processPayment(10001);
         } catch (IllegalAccessException e) {
             System.out.println("Error :" +e.getMessage());
         }
         catch (LimitExceededException e){
             System.out.println("Error"+e.getMessage());
         }
         finally {
             System.out.println("Transaction attempt finished.");
         }
        }
    }

