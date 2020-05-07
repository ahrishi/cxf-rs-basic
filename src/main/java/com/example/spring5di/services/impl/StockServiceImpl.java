package com.example.spring5di.services.impl;

import com.example.spring5di.services.StockService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/* Created by arankhri on 05-05-2020 */
@Service
public class StockServiceImpl implements StockService {
    @Override
    public String getQuote() {
        return "StockServiceImpl due to @Qualifier ";
    }
}
