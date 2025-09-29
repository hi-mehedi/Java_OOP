package Task5PartB;

import java.util.Arrays;
import java.util.List;

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
    }
}
