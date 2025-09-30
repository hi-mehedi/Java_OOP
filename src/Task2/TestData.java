package Task2;

public class TestData {
    int testId;
    String testName;
    boolean isAutomated;
    double executionTime;
    int priority;

    public TestData(int testId, String testName, boolean isAutomated, double executionTime, int priority){
        this.testId = testId;
        this.testName = testName;
        this.isAutomated = isAutomated;
        this.executionTime =executionTime;
        this.priority = priority;
    }
}
