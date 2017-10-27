package camt.cbsd.lab05.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = false)
public class Student {
    long id;
    String studentId;
    String name;
    String surname;
    double gpa;
    String image;
    boolean feature;
    int penAmount;
    String description;
}
