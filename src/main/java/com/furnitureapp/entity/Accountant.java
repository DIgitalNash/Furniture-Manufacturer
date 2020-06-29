package com.furnitureapp.entity;

public class Accountant extends Employee{

    public Accountant(AccountantBuilder accountantBuilder) {
        super(accountantBuilder);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static class AccountantBuilder extends EmployeeBuilder{

        public AccountantBuilder(){}

        public AccountantBuilder copy(Accountant accountant){
            super.setEmployeeCode(accountant.getEmployeeCode());
            super.setFullName(accountant.getFullName());
            super.setAddress(accountant.getAddress());
            super.setEmailAddress(accountant.getEmailAddress());
            super.setPhone(accountant.getPhone());
            super.setJob(accountant.getJob());
            super.setPassCode(accountant.getPassCode());
            return this;
        }

        public Accountant build(){
            return new Accountant(this);
        }

    }

}
