package com.example.spring5di.services.impl;

import com.example.spring5di.services.StockService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/* Created by arankhri on 04-05-2020 */

@Service
@Primary
public class DefaultStockServiceImpl implements StockService {
    @Override
    public String getQuote() {
        System.out.println("inside getQuote DefaultStockServiceImpl");
        return "you got the default due to @Primary annotation!";
    }
}
