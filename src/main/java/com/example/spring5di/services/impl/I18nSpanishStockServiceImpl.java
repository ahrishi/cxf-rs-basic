package com.example.spring5di.services.impl;

import com.example.spring5di.services.StockService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/* Created by arankhri on 05-05-2020 */
@Service("i18nService")
@Profile({"ES","default"})
public class I18nSpanishStockServiceImpl implements StockService {
    @Override
    public String getQuote() {
        return "I18nSpanishStockServiceImpl Hola Stocks";
    }
}
