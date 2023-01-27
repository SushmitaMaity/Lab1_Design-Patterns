package edu.neu.csye7374;

import java.util.List;

public class Amgen extends Stock {
    public Amgen(String name, double price, String description, List<Double> previousPrices) {
        setStockName(name);
        setPrice(price);
        setStockDescription(description);
        setPreviousPrices(previousPrices);
    }

    @Override
    public void setBid(double bid) {
        super.setBid(bid);
    }
    // Comparing consecutive previous stock prices to increment / decrement stockResult metric
    @Override
    public int getMetric() {
        int stockResult = 0;
        for (int i = 1; i < super.getPreviousPrices().size(); i++) {
            if(super.getPreviousPrices().get(i - 1) > super.getPreviousPrices().get(i)) {
                stockResult--;
            }
            else {
                stockResult++;
            }
        }
        return stockResult;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
