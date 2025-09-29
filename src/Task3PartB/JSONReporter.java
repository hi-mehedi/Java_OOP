package Task3PartB;

public class JSONReporter implements  TestReporter{
    private  TestDataFile dataFile;

    public JSONReporter(TestDataFile dataFile){
        this.dataFile = dataFile;
    }
    @Override
    public void generateReport() {
        System.out.println("JSON Report:");
        dataFile.getInfo();
    }

    @Override
    public void sendReport(String recipient) {
        System.out.println("Report sent:"+recipient);
    }

    public void setDataFile(TestDataFile dataFile) {
        this.dataFile = dataFile;
    }
}
