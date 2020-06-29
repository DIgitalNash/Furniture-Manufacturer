package com.furnitureapp.entity;

import java.util.List;

public class MaterialPurchase {
    //All attributes
    private String purNum;
    private String date;
    private List<String> materials;
    private String supplier;
    private Double total;

    //Constructor
    public MaterialPurchase(MaterialPurchaseBuilder builder) {
        this.purNum = builder.purNum;
        this.date = builder.date;
        this.materials = builder.materials;
        this.supplier = builder.supplier;
        this.total = builder.total;
    }

    //Getters
    public String getPurNum() {
        return purNum;
    }

    public String getDate() {
        return date;
    }

    public List<String> getMaterials() {
        return materials;
    }

    public String getSupplier() {
        return supplier;
    }

    public Double getTotal() {
        return total;
    }

    //Display with toString
    @Override
    public String toString() {
        return "Material Purchase{" +
                "purNum='" + purNum + '\'' +
                ", date='" + date + '\'' +
                ", materials='" + materials + '\'' +
                ", supplier='" + supplier + '\'' +
                ", total='" + total + '\'' +
                '}';
    }

    //Builder Pattern Design implementation
    public static class MaterialPurchaseBuilder{
        //All attributes in the builder class
        private String purNum;
        private String date;
        private List<String> materials;
        private String supplier;
        private Double total;

        //Setters
        public MaterialPurchaseBuilder setPurNum(String purNum) {
            this.purNum = purNum;
            return this;
        }

        public MaterialPurchaseBuilder setDate(String date) {
            this.date = date;
            return this;
        }

        public MaterialPurchaseBuilder setMaterials(List<String> materials) {
            this.materials = materials;
            return this;
        }

        public MaterialPurchaseBuilder setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }

        public MaterialPurchaseBuilder setTotal(Double total) {
            this.total = total;
            return this;
        }

        //Copy of the class MaterialPurchase
        public MaterialPurchaseBuilder copy(MaterialPurchase materialPurchase){
            this.purNum = materialPurchase.purNum;
            this.date = materialPurchase.date;
            this.materials = materialPurchase.materials;
            this.supplier = materialPurchase.supplier;
            this.total = materialPurchase.total;
            return this;
        }

        //Create a MaterialPurchaseBuilder constructor
        public MaterialPurchase build(){  return new MaterialPurchase(this);   }
    }
}
