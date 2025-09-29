package Task3PartB;

public interface TestReporter {
    void generateReport();
    void sendReport(String recipient);
    default void printSummary(){
        System.out.println("Report Generated Successfully");
    }
}
