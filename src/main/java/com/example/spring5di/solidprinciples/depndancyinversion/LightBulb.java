package com.example.spring5di.solidprinciples.depndancyinversion;

/* Created by arankhri on 08-05-2020 */
public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}
