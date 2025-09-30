package Task5PartB;

public abstract class TestData {
    private String type;
    private int priority;
    private  String status;

    public TestData(String type, int priority, String status){
        this.type = type;
        this.priority = priority;
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public int getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public abstract void  printInfo();

    public String getInfo(){
        return String.format("Test type: %s | Test priority : %d | Test status : %s", type,priority,status);
    }

}
