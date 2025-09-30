package Task2;


public class TestUtility {
    public static int calculatedPriorityScore(TestData testData) {
        return testData.isAutomated ? testData.priority * 10 : testData.priority * 5;
    }

    public static int calculatorPriorityScore(boolean isAutomated, int priority) {
        return isAutomated ? priority * 10 : priority * 5;
    }

    public void practiceOperator() {
        int testCount = 10;
        int passed = testCount++;
        int failed = --testCount;
        System.out.println(testCount);
        System.out.println(passed);
        System.out.println(failed);
    }

    public String getStatusMassage(int statusCode) {
        switch (statusCode) {
            case 1:
              return "Passed";
            case 2:
                return "Failed";
            case 3:
               return "Skipped";
            default:
               return "Unknown Status";
        }
    }

    public String formatTestResult(TestData testData, int statusCode){
        String status = getStatusMassage(statusCode);
        return String.format("Test: %s, Staus: %s, Time: %.2fs", testData.testName, status, testData.executionTime);
    }

    public  boolean isValidPriority(TestData testData){
        if (testData.priority >= 1 && testData.priority <= 5){
            return true;
        }
        else {
            return false;
        }
    }
}
