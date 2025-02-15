/*
修改记录：
- 2024-03-21 Assistant 修改股票服务使用StockDataProvider接口
*/
package com.stockai.application.service;

import com.stockai.domain.model.StockData;
import com.stockai.domain.repository.StockRepository;
import com.stockai.domain.external.StockDataProvider;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StockService {
    private final StockRepository stockRepository;
    private final StockDataProvider stockDataProvider;

    public StockService(StockRepository stockRepository, StockDataProvider stockDataProvider) {
        this.stockRepository = stockRepository;
        this.stockDataProvider = stockDataProvider;
    }

    @Transactional
    public void saveHistoricalData(String symbol) {
        StockData stockData = stockDataProvider.fetchRealTimeData(symbol);
        stockRepository.save(stockData);
    }
} 