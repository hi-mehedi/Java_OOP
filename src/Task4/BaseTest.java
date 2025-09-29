package Task4;

public class BaseTest {
    protected int a;
    protected  int b;

    public BaseTest(int a, int b){
        this.a =a;
        this.b = b;
    }

    protected String getResult(){
        int c = a +b;
        return "Result :" + c;
    }

    public void runTest() throws  TestExecutionException{
        System.out.println("Running Test :"+getResult());
        double random = Math.random();
        if (random<0.3){
            throw  new TestExecutionException("Test Due to fail for random error " +getResult());
        }
        else if ((random < 0.5)){
            throw  new NullPointerException("Null reference in" + getResult());
        }
        else {
            System.out.println("Test executed Successfully");
        }
    }
}
