/*
修改记录：
- 2024-03-21 Assistant 创建股票数据仓储实现
*/
package com.stockai.infrastructure.persistence.repository;

import com.stockai.domain.model.StockData;
import com.stockai.domain.repository.StockRepository;
import org.springframework.stereotype.Repository;

@Repository
public class StockRepositoryImpl implements StockRepository {
    private final JpaStockRepository jpaStockRepository;

    public StockRepositoryImpl(JpaStockRepository jpaStockRepository) {
        this.jpaStockRepository = jpaStockRepository;
    }

    @Override
    public StockData save(StockData stockData) {
        return jpaStockRepository.save(stockData);
    }

    @Override
    public StockData findBySymbol(String symbol) {
        return jpaStockRepository.findBySymbol(symbol);
    }
} 