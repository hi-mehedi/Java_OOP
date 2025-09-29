package Task3;

public class APITest extends BaseTest{
    String endPoint;

    public APITest(String testName, String endPoint){
        super(testName, " API Test ");
        this.endPoint = endPoint;
    }

    @Override
    public void executeTest() {
        getTestInfo();
        System.out.println("EndPoint :"+ endPoint);
    }
}
