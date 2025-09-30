package Task2;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    List<TestData> testDataList;

    public TestSuite(){
        testDataList = new ArrayList<>();
    }

    public void addTest(TestData test){
        testDataList.add(test);
    }

    public void printAllTest(){
        if(testDataList.isEmpty()){
            System.out.println("Test suite is empty");
        }
        else{
            for (TestData test : testDataList){
                System.out.println("Test id :"+test.testId + "|"+
                        "Test name :"+ test.testName +"|"+
                        "Test info :"+test.isAutomated +"|"+
                        "Test time :"+ test.executionTime +"|"+
                        "Test pri :" + test.priority);

            }
        }
    }

    public int countByStatus(String status){
        int count = 0;
        TestUtility testUtility = new TestUtility();
        for (int i = 0; i<testDataList.size(); i++){
            TestData test = testDataList.get(i);
            if (!testUtility.isValidPriority(test)){
                continue;
            }
            int statusCode = test.priority;
            String actualStatusCode = testUtility.getStatusMassage(statusCode);

            if (actualStatusCode.equals(status)){
                count++;
            }

            if (count>50){
                break;
            }
        }
        return  count;
    }
}
