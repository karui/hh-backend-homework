package ru.hh.nab.resource;

import java.time.LocalDate;

public class Vacancy {

    public Vacancy() {

    }

    public Vacancy(int id,
                   Company company,
                   String title) {
        this.id = id;
        this.company = company;
        this.title = title;
        this.dateCreate = LocalDate.now();
    }

    public Vacancy(
            int id,
            Company company,
            String title,
            String salary,
            String description,
            String contacts) {
        this.id = id;
        this.company = company;
        this.title = title;
        this.dateCreate = LocalDate.now();
        this.salary = salary;
        this.description = description;
        this.contacts = contacts;
    }

    private int id;
    private Company company;
    private String title;
    private String salary;
    private String description;
    private String contacts;

    //  @JsonIgnore
    private LocalDate dateCreate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateCreate() {
        return dateCreate.toString();
    }

    public void setDateCreate(LocalDate dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}
