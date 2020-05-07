package com.example.spring5di.controllers;

import com.example.spring5di.services.impl.DefaultStockServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setStockService(new DefaultStockServiceImpl());
    }
    @Test
    void getQuote() {
        System.out.println(this.getClass().getName() + " # " + controller.getQuote());
    }
}