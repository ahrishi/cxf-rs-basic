package com.example.spring5di.solidprinciples.depndancyinversion;

/* Created by arankhri on 08-05-2020 */
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
