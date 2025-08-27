package org.example.smarthome.devices;

import org.example.smarthome.interfaces.Switchable;

public abstract class Fan implements Switchable {
    private boolean isOn = false;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Fan is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Fan is OFF");
    }
}
