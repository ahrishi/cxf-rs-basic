package com.example.spring5di.controllers;

/* Created by arankhri on 05-05-2020 */

import com.example.spring5di.services.StockService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class I18nController {


    private final StockService stockService;

    public I18nController( @Qualifier("i18nService")StockService stockService) {
        this.stockService = stockService;
    }

    public String getQuote(){
        return stockService.getQuote();
    }

}
