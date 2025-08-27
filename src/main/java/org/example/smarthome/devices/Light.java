package org.example.smarthome.devices;

import org.example.smarthome.interfaces.DeviceInfo;
import org.example.smarthome.interfaces.Dimmable;
import org.example.smarthome.interfaces.Switchable;

public abstract class Light implements Switchable, Dimmable, DeviceInfo {
    private boolean isOn;
    private int dimLevel;
    private final String name;
    private final String deviceId;

    public Light(String name, String deviceId){
        this.name = name;
        this.deviceId = deviceId;
        this.isOn = false;
        this.dimLevel = Max_DIM_LEVEL;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println("%s turned ON (Brightness: %d%%)\n", name, dimLevel);
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(name + "is turned off");
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }
}
