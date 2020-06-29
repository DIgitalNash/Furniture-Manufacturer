package com.furnitureapp.entity;

public abstract class Employee {

    private String employeeCode;
    private String fullName;
    private String address;
    private String emailAddress;
    private String phone;
    private String passCode;
    private Job job;


    public Employee(EmployeeBuilder builder) {
        this.employeeCode = builder.employeeCode;
        this.fullName = builder.fullName;
        this.address = builder.address;
        this.emailAddress = builder.emailAddress;
        this.phone = builder.phone;
        this.passCode = builder.passCode;
        this.job = builder.job;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassCode(){
        return passCode;
    }

    public Job getJob(){
        return job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeCode='" + employeeCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", phone=" + phone +
                ", job=" + job +
                '}';
    }

    public static class EmployeeBuilder{
        private String employeeCode;
        private String fullName;
        private String address;
        private String emailAddress;
        private String phone;
        private String passCode;
        private Job job;

        public EmployeeBuilder setEmployeeCode(String employeeCode) {
            this.employeeCode = employeeCode;
            return this;
        }

        public EmployeeBuilder setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public EmployeeBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder setPassCode(String passCode){
            this.passCode = passCode;
            return this;
        }

        public EmployeeBuilder setJob(Job job){
            this.job = job;
            return this;
        }

    }

}