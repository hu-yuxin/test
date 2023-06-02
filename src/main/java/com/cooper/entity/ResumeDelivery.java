package com.cooper.entity;

public class ResumeDelivery {
    private Integer id;
    private String name;
    private String phone;
    private Double salary;
    private String descripe;
    private String status;

    public ResumeDelivery() {
    }

    public ResumeDelivery(Integer id, String name, String phone, Double salary, String descripe, String status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.salary = salary;
        this.descripe = descripe;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDescripe() {
        return descripe;
    }

    public void setDescripe(String descripe) {
        this.descripe = descripe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResumeDelivery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", descripe='" + descripe + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
