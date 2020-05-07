package com.example.spring5di.controllers;

import com.example.spring5di.services.impl.DefaultStockServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new DefaultStockServiceImpl());
    }

    @Test
    void getQuote() {
        System.out.println(this.getClass().getName() + " # " + controller.getQuote());
    }
}