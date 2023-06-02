package com.cooper.entity;

public class Job {
    private Integer id;
    private String jobname;
    private String jobdesc;
    private Double jobsalary;

    public Job() {
    }

    public Job(Integer id, String jobname, String jobdesc, Double jobsalary) {
        this.id = id;
        this.jobname = jobname;
        this.jobdesc = jobdesc;
        this.jobsalary = jobsalary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc;
    }

    public Double getJobsalary() {
        return jobsalary;
    }

    public void setJobsalary(Double jobsalary) {
        this.jobsalary = jobsalary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", jobname='" + jobname + '\'' +
                ", jobdesc='" + jobdesc + '\'' +
                ", jobsalary=" + jobsalary +
                '}';
    }
}
