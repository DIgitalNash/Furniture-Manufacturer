package com.furnitureapp.entity;

public class SaleCategory {
    // All the attributes
    private String saleCatTitle;
    private String saleCatDesc;

    //Constructor
    public SaleCategory(SaleCategoryBuilder builder) {
        this.saleCatTitle = builder.saleCatTitle;
        this.saleCatDesc = builder.saleCatDesc;
    }

    //Getters
    public String getSaleCatTitle() { return saleCatTitle;  }

    public String getSaleCatDesc() {  return saleCatDesc;   }

    //Display with toString
    @Override
    public String toString() {
        return "SaleCategory{" +
                "saleCatTitle='" + saleCatTitle + '\'' +
                ", saleCatDesc='" + saleCatDesc + '\'' +
                '}';
    }

    //Builder Design Pattern implementation
    public static class SaleCategoryBuilder{
        // All the attributes inside the builder class
        private String saleCatTitle;
        private String saleCatDesc;

        //Setters
        public SaleCategoryBuilder setSaleCatTitle(String saleCatTitle) {
            this.saleCatTitle = saleCatTitle;
            return this;
        }

        public SaleCategoryBuilder setSaleCatDesc(String saleCatDesc) {
            this.saleCatDesc = saleCatDesc;
            return this;
        }

        //copy of the class SaleCategory
        public SaleCategoryBuilder copy(SaleCategory saleCategory){
            this.saleCatTitle = saleCategory.saleCatTitle;
            this.saleCatDesc = saleCategory.saleCatDesc;
            return this;
        }

        //Create a SaleCategoryBuilder Constructor
        public SaleCategory build(){   return new SaleCategory(this);    }
    }
}
