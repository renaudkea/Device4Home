package dk.kea.device4home.service;

import dk.kea.device4home.model.*;

import java.util.List;

public class DeviceService {

    //Eager initialisation
    private static DeviceService mySelf = new DeviceService();

    public static DeviceService getInstance() {

        //LAZY initialisation

        //        if(mySelf == null){
        //            //Maybe do other stuff here.
        //            mySelf = new DeviceService();
        //        }

        return mySelf;

    }

    /*
        Make sure the constructor is private
     */
    private DeviceService() {
    }


    // Call
    public void call(Callable device, String number) {

        device.call(number);
    }

    //Connect
    public void connectToWifi(Connectable connectable, Wifi wifi) {
        connectable.ConnectWifi(wifi.getWifiName(), wifi.getPwd());

    }


    // Switch all off
    void switchAllOff(List<Powered> devices) {
        for (Powered device : devices) {
            device.switchOff();
        }
    }


}
