package com.furnitureapp.entity;

public class Material {
    //All attributes
    private String materialCode;
    private String name;
    private Double length;
    private Double weight;
    private int quantity;
    private Double price;
    private String supplier;

    //Constructor for builder class
    public Material(MaterialBuilder builder) {
        this.materialCode = builder.materialCode;
        this.name = builder.name;
        this.length = builder.length;
        this.weight = builder.weight;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.supplier = builder.supplier;
    }

    //Getters
    public String getMaterialCode() {
        return materialCode;
    }

    public String getName() {
        return name;
    }

    public Double getLength() {
        return length;
    }

    public Double getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public String getSupplier() {
        return supplier;
    }

    //Display with toString
    @Override
    public String toString() {
        return "Material{" +
                "materialCode='" + materialCode + '\'' +
                ", name='" + name + '\'' +
                ", length='" + length + '\'' +
                ", weight='" + weight + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }

    //Builder Pattern Design implementation
    public static class MaterialBuilder{
        //All attributes in the builder class
        private String materialCode;
        private String name;
        private Double length;
        private Double weight;
        private int quantity;
        private Double price;
        private String supplier;

        //Setters
        public MaterialBuilder setMaterialCode(String materialCode) {
            this.materialCode = materialCode;
            return this;
        }

        public MaterialBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public MaterialBuilder setLength(Double length) {
            this.length = length;
            return this;
        }

        public MaterialBuilder setWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        public MaterialBuilder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public MaterialBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public MaterialBuilder setSupplier(String supplier) {
            this.supplier = supplier;
            return this;
        }

        //Copy of the class Material
        public MaterialBuilder copy(Material material){
            this.materialCode = material.materialCode;
            this.name = material.name;
            this.length = material.length;
            this.weight = material.weight;
            this.quantity = material.quantity;
            this.price = material.price;
            this.supplier = material.supplier;
            return this;
        }

        //Create a MaterialBuilder constructor
        public Material build(){  return new Material(this);   }
    }

}