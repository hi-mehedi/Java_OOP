package Task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<TestData> testData = Arrays.asList(
                new TestData(1, "ba", true, 2.35, 1),
                new TestData(2 ,"ca", false , 2.4 , 3)
        );
        TestSuite testSuite = new TestSuite();

        for (TestData t : testData){
            testSuite.addTest(t);
        }
        testSuite.printAllTest();

        Map<String, Integer> testResults = new HashMap<>();
        testResults.put("LoginTest", 1);
        testResults.put("RegisterTest", 3);

        TestUtility testUtility1 = new TestUtility();
        for (String testName : testResults.keySet()) {
            System.out.println(testName + "   " +testUtility1.getStatusMassage(testResults.get(testName)));
        }
    }

}
