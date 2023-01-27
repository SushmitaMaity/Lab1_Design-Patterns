package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Tradable{
    private String stockName;
    private Double price;
    private List<Double> previousPrices = new ArrayList<>();
    private String stockDescription;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
        this.previousPrices.add(price);
    }

    public List<Double> getPreviousPrices() {
        return previousPrices;
    }

    public void setPreviousPrices(List<Double> previousPrices) {
        this.previousPrices = previousPrices;
    }

    public String getStockDescription() {
        return stockDescription;
    }

    public void setStockDescription(String stockDescription) {
        this.stockDescription = stockDescription;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(getStockName());
        sb.append("Description: ").append(getStockDescription());
        sb.append("Stock Price: ").append(getPrice());
        sb.append("Previous Stock Price: ").append(getPreviousPrices()).append("\n");
        return sb.toString();
    }

    @Override
    public void setBid(double bid) {
        previousPrices.add(bid);
    }

    @Override
    public int getMetric() {
        return 0;
    }
}