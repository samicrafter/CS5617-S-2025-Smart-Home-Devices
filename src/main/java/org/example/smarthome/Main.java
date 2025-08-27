package org.example.smarthome;


import org.example.smarthome.devices.Light;
import org.example.smarthome.devices.SimpleSwitch;
import org.example.smarthome.interfaces.Switchable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Switchable fan = new SimpleSwitch("Fan");
        Light light = new Light("Living Room Light");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Turn ON Light");
            System.out.println("2. Turn ON Light");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> light.turnOn();
                case 2 -> light.turnOff();
                case 3 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}