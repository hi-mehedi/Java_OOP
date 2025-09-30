package Task5PartB;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Filter;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<TestUtility> test1 = Arrays.asList(
                new TestUtility("Hi", "zero", 22),
                new TestUtility("hello", "one", 23),
                new TestUtility("Thanks", "two", 25)
        );

        for (TestUtility t : test1){
            TestUtility.logMessage(t.massage);
            TestUtility.logMessage(t.massage,t.level);
            TestUtility.logMessage(t.massage, t.level, t.timestamp);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }

        TestUtility.logMultipleMessage("Info", "Hi", "Hello", "How", "Thanks");

        List<TestData> testData1 = Arrays.asList(
                new UITest(1,"Login", 1, "Passed"),
                new UITest(2,"Registration",1,"Passed"),
                new UITest(3, "Payment",5,"Failed"),
                new UITest(4, "Forgot",5,"Failed"),
                new UITest(5, "Add to chart",5,"Failed"),
                new UITest(6, "Profile update",4,"Unknown")
        );

        System.out.println();
        System.out.println("UI Test ------------------------------ UI Test ----------------------------- UI Test");
        for (TestData data : testData1){
            data.printInfo();
        }
        System.out.println("|....................................................|");
        System.out.println("Filter info :");

        List<TestData> filter1 = testData1.stream().filter(n->n.getStatus().equals("Passed"))
                .collect(Collectors.toList());

        System.out.println("Only Passed :"+filter1);
        System.out.println("|........................................................|");

        List<TestData> filter2 = testData1.stream().filter(n->n.getPriority()>4).collect(Collectors.toList());
        System.out.println("Only high Priority 4-5 :"+filter2);
    }
}
