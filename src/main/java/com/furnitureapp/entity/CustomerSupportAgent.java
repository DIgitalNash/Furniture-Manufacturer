package com.furnitureapp.entity;

public class CustomerSupportAgent extends Employee {

    public CustomerSupportAgent(CSAgentBuilder builder) {
        super(builder);
    }

    @Override
    public String toString (){
        return super.toString();
    }

    public static class CSAgentBuilder extends EmployeeBuilder{
        public CSAgentBuilder(){ }


        public CSAgentBuilder copy(CustomerSupportAgent supportAgent){
            super.setFullName(supportAgent.getFullName());
            super.setAddress(supportAgent.getAddress());
            super.setEmailAddress(supportAgent.getEmailAddress());
            super.setPhone(supportAgent.getPhone());
            super.setJob(supportAgent.getJob());
            super.setPassCode(supportAgent.getPassCode());
            return this;
        }

        public CustomerSupportAgent build(){
            return new CustomerSupportAgent(this);
        }
    }

}
