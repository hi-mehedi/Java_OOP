package Task5;

public class UITets extends BaseTest{
    private  String uiFeature;
    public UITets(String name, String uiFeature){
        super(name,"This is nothing");
        this.uiFeature =uiFeature;
    }

    public String getUiFeature() {
        return uiFeature;
    }

    public void setUiFeature(String uiFeature) {
        this.uiFeature = uiFeature;
    }

    public String uiInfo(){
        return "Name :"+getName() + "UI Feature :" +uiFeature;
    }
}
