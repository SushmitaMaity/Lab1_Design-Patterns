package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Stock> stockList = new ArrayList<>();
    private static StockMarket instance;
    private StockMarket() {
    }

    public static synchronized StockMarket getInstance()
    {
        if (instance == null)
        {
            instance = new StockMarket();
        }
        return instance;
    }

    public void AddStock(ArrayList<Stock> stockList) {
        this.stockList = stockList;
    }

    public void DeleteStock(Stock stock) {
        stockList.remove(stock);
    }

    public Double getPrice(Stock stock) {
        Double nPrice = 0.0;

        Double prev = 0.0;
        for (int i = 0; i < stock.getPreviousPrices().size(); i++) {
            prev = prev + stock.getPreviousPrices().get(i);
        }
        nPrice = ((stock.getPreviousPrices().get(5) + (prev/stock.getPreviousPrices().size()))/2) + (6 * stock.getMetric());

        return nPrice;
    }

    public void TradeStock(ArrayList<Stock> stockList) {
        for(Stock st : stockList){
            int stockResult = st.getMetric();
            double currentPrice = st.getPrice();
            int numOfBids = st.getPreviousPrices().size();
            st.setPrice(currentPrice + stockResult * numOfBids);
        }
    }

    @Override
    public String toString() {
        StringBuilder stockInfo = new StringBuilder();
        for(Stock st: stockList) {
            stockInfo.append(st.toString());
            stockInfo.append("Rating: ").append(st.getMetric()).append("\n");
        }
        return stockInfo.toString();
    }
}