/*
修改记录：
- 2024-03-21 Assistant 创建股票数据提供者接口
*/
package com.stockai.domain.external;

import com.stockai.domain.model.StockData;

public interface StockDataProvider {
    StockData fetchRealTimeData(String symbol);
} 