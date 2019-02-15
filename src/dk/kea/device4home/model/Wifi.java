package dk.kea.device4home.model;

public class Wifi {

    private String wifiName;
    private String pwd;


    public String getWifiName() {
        return wifiName;
    }

    public Wifi(String wifiName, String pwd) {
        this.wifiName = wifiName;
        this.pwd = pwd;
    }

    public void setWifiName(String wifiName) {
        this.wifiName = wifiName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
