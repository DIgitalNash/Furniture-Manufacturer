package com.furnitureapp.entity;

public class Clerk extends Employee{

    public Clerk(ClerkBuilder builder) {
        super(builder);
    }

    @Override
    public String toString() {
        return  super.toString();
    }

    public static class ClerkBuilder extends EmployeeBuilder{
        public ClerkBuilder(){}

        public ClerkBuilder copy(Clerk clerk){
            super.setEmployeeCode(clerk.getEmployeeCode());
            super.setFullName(clerk.getFullName());
            super.setAddress(clerk.getAddress());
            super.setEmailAddress(clerk.getEmailAddress());
            super.setPhone(clerk.getPhone());
            super.setJob(clerk.getJob());
            super.setPassCode(clerk.getPassCode());
            return this;
        }

        public Clerk build(){
            return new Clerk(this);
        }

    }
}
