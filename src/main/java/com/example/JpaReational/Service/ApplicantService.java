package com.example.JpaReational.Service;

import com.example.JpaReational.Controller.ApplicantController;
import com.example.JpaReational.Entity.Applicant;
import com.example.JpaReational.Repositaries.ApplicantRepositary;
import org.springframework.stereotype.Service;

@Service
public class ApplicantService {

    private final ApplicantRepositary applicantRepositary;

    public ApplicantService(ApplicantRepositary applicantRepositary){
        this.applicantRepositary =applicantRepositary;
    }


    public Applicant getApplicant(Long id){
        return applicantRepositary.findById(id).orElse(null);
    }

    public Applicant createApplicant(Applicant applicant){
        return  applicantRepositary.save(applicant);
    }


}
