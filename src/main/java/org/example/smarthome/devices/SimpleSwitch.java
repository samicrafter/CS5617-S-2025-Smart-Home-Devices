package org.example.smarthome.devices;


import org.example.smarthome.interfaces.Switchable;

public class SimpleSwitch implements Switchable {
    private final String name;
    private boolean isOn;

    public SimpleSwitch(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " is OFF");
    }

    public boolean isOn() {
        return false;
    }
}