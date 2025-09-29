package Task5PartB;

public class TestUtility {
    String massage;
    String level;
    long timestamp;

    public TestUtility(String message, String level, long timestamp){
        this.massage = message;
        this.level = level;
        this.timestamp = timestamp;
    }

    public static void logMessage(String message){
        System.out.println("this is massage :"+message);
    }

    public static void logMessage(String massage , String level){
        System.out.println("This is message :"+massage + " This is level :"+level);
    }

    public static  void logMessage(String message, String level, long timestamp){
        System.out.println("This is message :"+ message + " This is level:"+level + " This is timestamp:"+timestamp);
    }

    public static void logMultipleMessage(String level, String... messages){
        for (String msg : messages){
            System.out.println(level + "|" + msg);
        }
    }
}
