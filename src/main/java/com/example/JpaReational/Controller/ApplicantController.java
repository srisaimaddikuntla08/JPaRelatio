package com.example.JpaReational.Controller;


import com.example.JpaReational.Entity.Applicant;
import com.example.JpaReational.Service.ApplicantService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApplicantController {
    private ApplicantService applicantService;

    public ApplicantController(ApplicantService applicantService){
        this.applicantService = applicantService;
    }

    @GetMapping("/applicants/{id}")
    public Applicant getAllApplicants(@PathVariable Long id){
        return  applicantService.getApplicant(id);
    }

    @PostMapping("/applicant")
    public Applicant create(@RequestBody Applicant applicant){
        return applicantService.createApplicant(applicant);
    }


}
