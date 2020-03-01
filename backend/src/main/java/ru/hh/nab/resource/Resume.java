package ru.hh.nab.resource;

import java.time.LocalDate;

public class Resume {

  public Resume() {

  }

  public Resume(int id, Applicant applicant , String title) {
    this.id = id;
    this.applicant = applicant;
    this.title = title;
    this.dateCreate = LocalDate.now();
  }

  private int id;
  private Applicant applicant;
  private String title;

//  @JsonIgnore
  private LocalDate dateCreate;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDateCreate() {
    return dateCreate.toString();
  }

  public void setDateCreate(LocalDate dateCreate) {
    this.dateCreate = dateCreate;
  }


  public Applicant getApplicant() {
    return applicant;
  }

  public void setApplicant(Applicant applicant) {
    this.applicant = applicant;
  }
}
