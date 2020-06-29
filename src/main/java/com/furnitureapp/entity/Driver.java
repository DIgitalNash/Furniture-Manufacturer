package com.furnitureapp.entity;

public class Driver extends Employee{

    public Driver (DriverBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return  super.toString();
    }

    public static class DriverBuilder extends EmployeeBuilder {
        public DriverBuilder(){}

        public DriverBuilder copy(Driver driver){
            super.setEmployeeCode(driver.getEmployeeCode());
            super.setFullName(driver.getFullName());
            super.setAddress(driver.getAddress());
            super.setEmailAddress(driver.getEmailAddress());
            super.setPhone(driver.getPhone());
            super.setJob(driver.getJob());
            super.setPassCode(driver.getPassCode());
            return this;
        }

        public Driver build(){
            return new Driver(this);
        }

    }
}
