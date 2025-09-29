package Task5;

public class BaseTest {
    private String name;
    private String des;

    public BaseTest(String name, String des){
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public  String testRes(){
        return String.format("Name is :%s Description is: %s",name, des);
    }
}
