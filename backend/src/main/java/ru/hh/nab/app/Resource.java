package ru.hh.nab.app;

import ru.hh.nab.resource.Applicant;
import ru.hh.nab.resource.Company;
import ru.hh.nab.resource.Resume;
import ru.hh.nab.resource.Vacancy;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/")
public class Resource {

  @GET
  @Path("/hello")
  @Produces("application/json")
  public String hello(@DefaultValue("world") @QueryParam("name") String name) {
    return String.format("Hello, %s!", name);
  }

  @GET
  @Path("/exit")
  @Produces("application/json")
  public String exit(@DefaultValue("world") @QueryParam("name") String name) {
    System.exit(0);
    return "exit!";
  }

  @GET
  @Path("/resume")
  @Produces("application/json")
  public Response getResumeList() {

    Applicant applicant1 = new Applicant(1,"Вася");
    Applicant applicant2 = new Applicant(2,"Петя");
    Applicant applicant3 = new Applicant(3,"Коля");

    Resume resume1 = new Resume(1,applicant1,"Резюме1");
    Resume resume2 = new Resume(2,applicant2,"Резюме2");
    Resume resume3 = new Resume(3,applicant3,"Резюме3");

    ArrayList<Resume> resumeList= new ArrayList<>(List.of(resume1, resume2, resume3));
    return Response.ok(resumeList).build();
  }

  @GET
  @Path("/resume/{id}")
  @Produces("application/json")
  public Response getResume(@PathParam("id") int id) {
    return Response.ok(id).build();
  }

  @GET
  @Path("/vacancy")
  @Produces("application/json")
  public Response getVacancyList() {

    Company company1 = new Company(11,"Компания1");
    Company company2 = new Company(11,"Компания2");
    Company company3 = new Company(11,"Компания3");

    Vacancy vacancy1 = new Vacancy(1,company1,"Вакансия1");
    Vacancy vacancy2 = new Vacancy(2,company2,"Вакансия2");
    Vacancy vacancy3 = new Vacancy(3,company3,"Вакансия3");

    ArrayList<Vacancy> vacancyList= new ArrayList<>(List.of(vacancy1, vacancy2, vacancy3));
    return Response.ok(vacancyList).build();

  }

  @GET
  @Path("/vacancy/{id}")
  @Produces("application/json")
  public Response getVacancy(@PathParam("id") int id) {
    Company company = new Company(id,"Компания"+Integer.toString(id));
    Vacancy vacancy = new Vacancy(
            id, company, "Вакансия"+Integer.toString(id),
            "12345", "description","contacts");

    return Response.ok(vacancy).build();
  }

  @GET
  @Path("/vacancy/{id}/negotiations")
  @Produces("application/json")
  public Response getVacancyNegotiations(@PathParam("id") int id) {
    return Response.ok(new ArrayList<Integer>()).build();
  }


  }
