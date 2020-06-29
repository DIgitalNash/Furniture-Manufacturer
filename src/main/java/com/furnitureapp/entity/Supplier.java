package com.furnitureapp.entity;

public class Supplier {
    //All attributes
    private String name;
    private String phone;
    private String email;
    private String address;

    //Constructor
    public Supplier(SupplierBuilder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.email = builder.email;
        this.address = builder.address;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    //Display with toString
    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    //Builder Pattern Design implementation
    public static class SupplierBuilder{
        //All attributes in the builder class
        private String name;
        private String phone;
        private String email;
        private String address;

        //Setters
        public SupplierBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public SupplierBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public SupplierBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public SupplierBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        //Copy of the class Supplier
        public SupplierBuilder copy(Supplier supplier){
            this.name = supplier.name;
            this.phone = supplier.phone;
            this.email = supplier.email;
            this.address = supplier.address;
            return this;
        }

        //Create a SupplierBuilder constructor
        public Supplier build(){  return new Supplier(this);   }
    }
}
