package edu.neu.csye7374;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Stock Market!");

        StockMarket market = StockMarket.getInstance();

        ArrayList<Stock> stockList = new ArrayList<>();

        // New Lululemon stock
        Stock Lululemon = new Lululemon("Lululemon Stock", 9.0, "Lululemon Stock Description", new ArrayList<>(Arrays.asList(73.0,6.31,76.1,34.5,86.1,29.8)));
        Lululemon.setBid(12.0);
        Lululemon.setBid(65.0);
        Lululemon.setBid(71.0);
        Lululemon.setBid(89.0);
        stockList.add(Lululemon);


        // New Amgen stock
        Stock Amgen = new Amgen("Amgen Stock", 45.0, "Amgen Stock Description", new ArrayList<>(Arrays.asList(91.0,14.0,65.4,57.6)));
        Amgen.setBid(91.0);
        Amgen.setBid(41.0);
        Amgen.setBid(52.0);
        Amgen.setBid(76.0);
        stockList.add(Amgen);

        market.AddStock(stockList);

        System.out.println(market.toString());

        // Deleting Amgen Stock from stock market
        market.DeleteStock(Amgen);
        System.out.println("Deleted Amgen's Stock from StockMarket");


        System.out.println("New Stock Market:");
        System.out.println(market.toString());
        System.out.println("Closing Stock Market");
    }
}