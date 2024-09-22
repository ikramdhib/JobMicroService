package com.example.jobproject.Repositories;

import com.example.jobproject.Entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job,Integer> {

    Job findByServiceLike(String nom);
}
