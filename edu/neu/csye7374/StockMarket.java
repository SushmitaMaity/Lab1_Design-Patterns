package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {

    private double price;
    private String name;
    private double bid;
    private int metric;

    private StockMarket() {
        super();
    }

    public static StockMarket getInstance() {
        StockMarket instance = new StockMarket();
        return instance;
    }
    public StockMarket(String name, double price, double bid, int metric) {
        super();
        this.name = name;
        this.price = price;
        this.bid = bid;
        this.metric = metric;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getBid() {
        return bid;
    }
    public void setBid(double bid) {
        this.bid = bid;
    }
    public int getMetric() {
        return metric;
    }
    public void setMetric(int metric) {
        this.metric = metric;
    }

    @Override
    public String toString() {
        return "StockAPI{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", bid=" + bid +
                ", metric="+getMetric()+
                '}';
    }
    public void addStock(){

    }
    public void removeStock(){

    }
    public void showStock(){

    }
    public void tradeStock(){

    }
    public static void demo() {
        StockMarket amgen = Amgen.getObject();
        {
            amgen.setName("Amgen");
            amgen.setPrice(1500.45);
            amgen.setBid(1000.34);
            amgen.setMetric(45);
        }
    }

    public StockMarket getObject(){

    };
}

