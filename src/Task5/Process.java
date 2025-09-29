package Task5;


public class Process {
    public  void processTest(BaseTest test){
        if(test instanceof UITets){
            UITets uiTest = (UITets) test;
            System.out.println(uiTest.testRes());
            System.out.println(uiTest.uiInfo());
        }
    }
}
