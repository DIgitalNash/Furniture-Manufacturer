package com.furnitureapp.entity;

public class Job {
    private String jobTitle;
    private double salary;

    private Job(JobBuilder builder) {
        this.jobTitle = builder.jobTitle;
        this.salary = builder.salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static class JobBuilder{
        private String jobTitle;
        private double salary;

        public JobBuilder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public JobBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public JobBuilder copy(Job job){
            this.jobTitle = job.jobTitle;
            this.salary = job.salary;
            return this;
        }

        public Job build(){
            return new Job(this);
        }
    }
}
