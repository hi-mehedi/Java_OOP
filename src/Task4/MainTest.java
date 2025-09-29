package Task4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        List<BaseTest> base =  Arrays.asList(
                new Test(1,5),
                new Test(5,6),
                new Test(7,8)
        );

        for (BaseTest b :  base){
            try {
                b.runTest();
            }
            catch (TestExecutionException e){
                System.out.println("Caught custom exception :" + e.getMessage());
            }

            catch (NullPointerException e){
                System.out.println("Null ex"+e.getMessage());
            }

            catch (Exception e){
                System.out.println("Exception "+e.getMessage());
            }
        }
    }
}
