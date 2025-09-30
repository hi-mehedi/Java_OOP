package Task5PartB;

import Task5.BaseTest;

public class UITest extends TestData {
    int SL;
    public UITest(int SL,String type, int priority, String status){
        super(type, priority, status);
        this.SL = SL;
    }

    @Override
    public void printInfo() {
        System.out.println("Sl no:"+SL);
        System.out.println("Get Info:"+getInfo());
    }

    public String toString(){
        return "Sl no :"+ SL + " " + getInfo();
    }
}
