package Task3;

import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<BaseTest> testSuite = Arrays.asList(
                new UITest("Login","chrome"),
                new APITest("Login", "/api")
        );
        for (BaseTest b : testSuite){
            b.executeTest();
        }

    }
}
