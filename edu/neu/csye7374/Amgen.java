package edu.neu.csye7374;

public class Amgen extends StockMarket{
    public Amgen(String name, double price, double bid, int metric) {
        super(name, price, bid, metric);
    }

    public Amgen() {
        super();
    }

    @Override
    public StockMarket getObject() {
        return new Amgen();
    }
}
