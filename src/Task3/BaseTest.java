package Task3;

public abstract class BaseTest {
    protected String testName;
    protected String description;

    public BaseTest(String testName, String description){
        this.testName = testName;
        this.description = description;
    }

   public abstract void executeTest();

    public void getTestInfo(){
        System.out.println("TestName :" +testName +"   "+" Description :" +description);
    }
}
