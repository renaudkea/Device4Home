package dk.kea.device4home.Controller;

import dk.kea.device4home.model.*;
import dk.kea.device4home.service.DeviceService;

public class SomeController {


    public static void main(String[] args) {


        DeviceService service = DeviceService.getInstance();
        Wifi wifi = new Wifi("kea", "1234");

        Phone phone = new Phone();
        SmartPhone iPhone = new SmartPhone();

        TV tv = new TV();
        Computer mac = new Computer();


        Powered d = new SmartPhone();
        Powered t = new Tablet();



        Device dd = new Computer();


          if(dd instanceof SmartPhone){
             SmartPhone p = (SmartPhone) dd;
    }


        service.connectToWifi(new Fridge(), wifi);


        service.connectToWifi(mac, wifi);



        service.connectToWifi(iPhone, wifi);
        service.connectToWifi(mac, wifi);

        service.call(phone, "12121212");
        service.call(iPhone, "12121212");



        //automatic casting/upcasting

        Device device = new SmartPhone();

        // Downcasting

        SmartPhone sp = (SmartPhone) device;   // resolve at compile time











    }
}
