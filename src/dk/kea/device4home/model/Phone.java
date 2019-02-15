package dk.kea.device4home.model;

public class Phone extends Device implements Callable {


    @Override
    protected void turnOff() {
        // turn the shit off
    }

    @Override
    protected void turnOn() {

    }


    // From Callable

    @Override
    public void receiveCall() {

    }

    @Override
    public void call(String phoneNumber) {

    }
}
