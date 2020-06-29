package com.furnitureapp.entity;

public class Manager extends Employee{

    private Manager(ManagerBuilder managerBuilder){
        super(managerBuilder);
    }

    public static class ManagerBuilder extends Employee.EmployeeBuilder{

        public ManagerBuilder(){
        }

        public Manager build() {
            return new Manager(this);
        }

        public ManagerBuilder copy(Manager manager){
            super.setEmployeeCode(manager.getEmployeeCode());
            super.setFullName(manager.getFullName());
            super.setAddress(manager.getAddress());
            super.setEmailAddress(manager.getEmailAddress());
            super.setPhone(manager.getPhone());
            super.setJob(manager.getJob());
            super.setPassCode(manager.getPassCode());
            return this;
        }
    }


    //For testing purposes
    public static void main(String[] args) {
        ManagerBuilder a = new ManagerBuilder();
        a.setEmployeeCode("543289");
        a.setFullName("Yaseen Johnston");
        a.setAddress("45 Beach Road");
        a.setEmailAddress("yaseen@xyz.com");
        a.setPhone("123456789");
        a.setPassCode("4321");
        //a.setJob(new Job());
        Manager m = new Manager(a);

        System.out.println(m.toString());
    }

}
