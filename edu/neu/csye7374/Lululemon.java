package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class Lululemon extends Stock {
    public Lululemon(String name, double price, String description, List<Double> previousPrices) {
        setStockName(name);
        setPrice(price);
        setStockDescription(description);
        setPreviousPrices(previousPrices);
    }

    @Override
    public void setBid(double bid) {
        super.setBid(bid);
    }
    // Calculate Average
    public Double getAverage(int size){
        double averageStkPrc = 0.0d;
        for(int i = 0; i < size; i++) {
            averageStkPrc += this.getPreviousPrices().get(i);
        }
        averageStkPrc = averageStkPrc / size;
        return averageStkPrc;
    }
    @Override
    public int getMetric() {
        double averageStkPrc;
        int n = this.getPreviousPrices().size();
        averageStkPrc = this.getAverage(n);
        double currentPrice = this.getPreviousPrices().get(n - 1);

        int stockResult = 0;
        // Checking by taking average prices of stock and comparing to get the metric
        if(currentPrice >= averageStkPrc) stockResult++;
        else stockResult--;

        return  stockResult;
    }

    @Override
    public String toString() {return super.toString();}

}