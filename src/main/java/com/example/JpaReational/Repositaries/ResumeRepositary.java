package com.example.JpaReational.Repositaries;

import com.example.JpaReational.Entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface ResumeRepositary extends JpaRepository<Resume,Long> {
}
