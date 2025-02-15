/*
修改记录：
- 2024-03-21 Assistant 修改Alpha Vantage客户端实现StockDataProvider接口
*/
package com.stockai.infrastructure.external;

import com.stockai.domain.model.StockData;
import com.stockai.domain.external.StockDataProvider;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import java.time.LocalDateTime;

@Component
public class AlphaVantageClient implements StockDataProvider {
    private final RestTemplate restTemplate;
    private final String apiKey = "TKRPNLH6WNS0VC98";

    public AlphaVantageClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public StockData fetchRealTimeData(String symbol) {
        String url = UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.co/query")
                .queryParam("function", "TIME_SERIES_INTRADAY")
                .queryParam("symbol", symbol)
                .queryParam("interval", "1min")
                .queryParam("apikey", apiKey)
                .toUriString();

        var response = restTemplate.getForObject(url, AlphaVantageResponse.class);
        return convertToStockData(response, symbol);
    }

    private StockData convertToStockData(AlphaVantageResponse response, String symbol) {
        StockData stockData = new StockData();
        stockData.setSymbol(symbol);
        stockData.setTimestamp(LocalDateTime.now());
        return stockData;
    }
} 