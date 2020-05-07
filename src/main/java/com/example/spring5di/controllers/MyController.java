package com.example.spring5di.controllers;

/* Created by arankhri on 05-05-2020 */

import com.example.spring5di.services.StockService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String getQuote(){
        return "from my controller";
    }

}
