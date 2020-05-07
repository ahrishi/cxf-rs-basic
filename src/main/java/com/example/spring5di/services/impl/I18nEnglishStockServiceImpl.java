package com.example.spring5di.services.impl;

import com.example.spring5di.services.StockService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/* Created by arankhri on 05-05-2020 */
@Service("i18nService")
@Profile("EN")
public class I18nEnglishStockServiceImpl implements StockService {
    @Override
    public String getQuote() {
        return " I18nEnglishStockServiceImpl Hello Stocks";
    }
}
