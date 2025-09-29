package Task3;

public class UITest extends BaseTest{
    String BrowserType;

    public UITest(String testName, String BrowserType){
        super(testName, " UI Test ");
        this.BrowserType = BrowserType;
    }

    @Override
    public void executeTest() {
        getTestInfo();
        System.out.println("BrowserType: "+BrowserType);
    }
}
