package dk.kea.device4home.model;

public abstract class Device implements Powered {


    private String powerVoltage;

    protected Boolean isOn = false;



    public Device() {
    }

    public Device(String powerVoltage) {
        this.powerVoltage = powerVoltage;
    }

    public String getPowerVoltage() {
        return powerVoltage;
    }



    @Override
    public void switchOn() {
        if (!isOn){
            turnOn();
            isOn =true;
        }
    }

    @Override
    public void switchOff() {

        if (isOn){
            turnOff();
            isOn =false;
        }

    }

    protected abstract void turnOff();
    protected abstract void turnOn();


}
