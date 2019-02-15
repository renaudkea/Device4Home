package dk.kea.device4home.model;

public class SmartPhone extends Phone implements Connectable{


    //From Device
    @Override
    protected void turnOff() {

        //make sure we disconnect Wifi
        disConnect();
        super.turnOff();

    }

    // From Connectable
    @Override
    public void ConnectWifi(String wifiName, String pwd) {
        // Connect ..
    }

    @Override
    public void disConnect() {

    }
}
