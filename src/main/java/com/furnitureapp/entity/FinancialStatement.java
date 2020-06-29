package com.furnitureapp.entity;

import java.util.List;

// Will be printing the list of all expenses and entries over a period.
public class FinancialStatement {
    private int statementCode;
    private String date;
    private List<MaterialPurchase> materialsBought;
    private List<Sale> salesList;

    public FinancialStatement(statementBuilder statementBuilder){
        this.statementCode = statementBuilder.statementCode;
        this.date = statementBuilder.date;
        this.materialsBought = statementBuilder.materialsBought;
        this.salesList = statementBuilder.salesList;
    }

    public int getStatementCode() {
        return statementCode;
    }

    public String getDate() {
        return date;
    }

    public List<MaterialPurchase> getMaterialsBought() {
        return materialsBought;
    }

    public List<Sale> getSalesList() {
        return salesList;
    }

    public static class statementBuilder {
        private int statementCode;
        private String date;
        private List<MaterialPurchase> materialsBought;
        private List<Sale> salesList;

        public statementBuilder(){}

        public statementBuilder setStatementCode(int statementCode) {
            this.statementCode = statementCode;
            return this;
        }

        public statementBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public statementBuilder setMaterialsBought(List<MaterialPurchase> materialsBought) {
            this.materialsBought = materialsBought;
            return this;
        }

        public statementBuilder setSalesList(List<Sale> salesList) {
            this.salesList = salesList;
            return this;
        }

        public statementBuilder copy(FinancialStatement financialStatement){
            this.statementCode = financialStatement.statementCode;
            this.date = financialStatement.date;
            this.materialsBought = financialStatement.materialsBought;
            this.salesList = financialStatement.salesList;
            return this;
        }

        public FinancialStatement build(){
            return new FinancialStatement(this);
        }
    }

}
