package com.example.JpaReational.Repositaries;

import com.example.JpaReational.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepositary extends JpaRepository<Applicant,Long> {
}
