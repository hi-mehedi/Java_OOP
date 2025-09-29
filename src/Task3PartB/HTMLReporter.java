package Task3PartB;

public class HTMLReporter implements TestReporter{
    private TestDataFile dataFile;

    public  HTMLReporter(TestDataFile dataFile){
        this.dataFile = dataFile;
    }
    @Override
    public void generateReport() {
        System.out.println("HTML Report:");
        dataFile.getInfo();
    }

    @Override
    public void sendReport(String recipient) {
        System.out.println("Sent to :"+recipient);
    }

    public void setDataFile(TestDataFile dataFile) {
        this.dataFile = dataFile;
    }
}
