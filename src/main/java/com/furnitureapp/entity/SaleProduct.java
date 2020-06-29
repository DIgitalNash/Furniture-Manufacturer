package com.furnitureapp.entity;

public class SaleProduct {
    //All attributes
    private int saleCode;
    private int prodCode;
    private int quantity;

    //Constructor
    public SaleProduct(SaleProductBuilder builder) {
        this.saleCode = builder.saleCode;
        this.prodCode = builder.prodCode;
        this.quantity = builder.quantity;
    }
    //Getters
    public int getSaleCode() {
        return saleCode;
    }

    public int getProdCode() {
        return prodCode;
    }

    public int getQuantity() {
        return quantity;
    }

    //Builder Pattern Design implementation
    public static class SaleProductBuilder{
        //All attributes int the builder class
        private int saleCode;
        private int prodCode;
        private int quantity;

        //Setters
        public SaleProductBuilder setSaleCode(int saleCode) {
            this.saleCode = saleCode;
            return this;
        }

        public SaleProductBuilder setProdCode(int prodCode) {
            this.prodCode = prodCode;
            return this;
        }

        public SaleProductBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        //Copy of the class SaleProduct
        public SaleProductBuilder copy(SaleProduct saleProduct){
            this.saleCode = saleProduct.saleCode;
            this.prodCode = saleProduct.prodCode;
            this.quantity = saleProduct.quantity;
            return this;
        }

        //Create a SaleProductBuilder constructor
        public SaleProduct build(){  return new SaleProduct(this);   }
    }
}
