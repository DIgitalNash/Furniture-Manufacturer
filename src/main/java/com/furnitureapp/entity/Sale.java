package com.furnitureapp.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sale{
    //All attributes
    private int saleCode;
    private double totAmt;
    private String saleTime;

    //Constructor
    private Sale(SaleBuilder builder){
        this.saleCode = builder.saleCode;
        this.totAmt = builder.totAmt;
        this.saleTime = builder.saleTime;
    }

    //getters
    public int getSaleCode() { return saleCode; }

    public double getTotAmt() { return totAmt;  }

    public String getSaleTime() {
        //SimpleDateFormat will be used on the receipt to show the time of the transaction
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date now = new Date();
        String saleTime = sdf.format(now);
        return saleTime;
    }

    //display on the screen
    @Override
    public String toString() {
        return "Sale{" +
                "saleCode=" + saleCode +
                ", totAmt=" + totAmt +
                ", saleTime='" + saleTime + '\'' +
                '}';
    }

    //Builder Design Pattern implementation
    public static class SaleBuilder{
        //Attributes used in builder pattern
        private int saleCode;
        private double totAmt;
        private String saleTime;

        //setters
        public SaleBuilder setSaleCode(int saleCode) {
            this.saleCode = saleCode;
            return this;
        }

        public SaleBuilder setTotAmt(double totAmt) {
            this.totAmt = totAmt;
            return this;
        }

        public SaleBuilder setSaleTime(String saleTime) {
            this.saleTime = saleTime;
            return this;
        }

        //create a copy of the sale object in the builder pattern
        public SaleBuilder copy(Sale sale){
            this.saleCode = sale.saleCode;
            this.totAmt = sale.totAmt;
            this.saleTime= sale.saleTime;
            return this;
        }

        //
        public Sale build(){  return new Sale(this);   }
    }


}
