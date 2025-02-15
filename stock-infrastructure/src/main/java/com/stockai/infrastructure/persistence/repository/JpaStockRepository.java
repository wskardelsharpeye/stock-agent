/*
修改记录：
- 2024-03-21 Assistant 创建JPA仓储接口
*/
package com.stockai.infrastructure.persistence.repository;

import com.stockai.domain.model.StockData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaStockRepository extends JpaRepository<StockData, Long> {
    StockData findBySymbol(String symbol);
} 