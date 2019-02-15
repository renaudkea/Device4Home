package dk.kea.device4home.model;

public class Computer extends Device implements Connectable {


    @Override
    protected void turnOff() {

    }
    @Override
    protected void turnOn() {

    }

    // From Connectable
    @Override
    public void ConnectWifi(String wifiName, String pwd) {

    }

    @Override
    public void disConnect() {

    }
}
