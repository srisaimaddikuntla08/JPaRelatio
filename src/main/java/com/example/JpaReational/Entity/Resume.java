package com.example.JpaReational.Entity;


import jakarta.persistence.*;

@Entity
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String skills;


    @OneToOne(mappedBy = "resume")
    private Applicant applicant;


    public Resume(){

    }

    public  Resume(Long id){
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }



    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Applicant getApplicant(){
        return applicant;
    }


}
