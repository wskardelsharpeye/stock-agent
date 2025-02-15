/*
修改记录：
- 2024-03-21 Assistant 迁移股票数据仓储接口到domain模块
*/
package com.stockai.domain.repository;

import com.stockai.domain.model.StockData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository {
    StockData save(StockData stockData);
    StockData findBySymbol(String symbol);
} 