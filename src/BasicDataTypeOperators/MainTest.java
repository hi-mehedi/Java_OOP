package BasicDataTypeOperators;

public class MainTest {
    public static void main(String[] args) {
        TestData test1 = new TestData(101,"LoginPage", false, 2.35, 5);
        System.out.println(TestUtility.calculatedPriorityScore(test1));
        System.out.println(TestUtility.calculatorPriorityScore(true, 3));
        System.out.println("....................................");
        TestUtility testUtility = new TestUtility();
        testUtility.practiceOperator();
        System.out.println("....................................");
        System.out.println(testUtility.formatTestResult(test1,1));
        System.out.println(testUtility.isValidPriority(test1));
    }
}
