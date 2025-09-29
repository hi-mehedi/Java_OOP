package Task3PartB;

public class MainTest {
    public static void main(String[] args) {
        TestDataFile data = new TestDataFile("Mehedi", "mehedi@gmail.com");
        HTMLReporter htmlReporter = new HTMLReporter(data);
        JSONReporter jsonReporter = new JSONReporter(data);
        htmlReporter.printSummary();
        htmlReporter.generateReport();
        htmlReporter.sendReport("hasan@gmail.com");
        System.out.println("................................");
        jsonReporter.printSummary();
        jsonReporter.generateReport();
        jsonReporter.sendReport("me@gmail.com");
    }

}
