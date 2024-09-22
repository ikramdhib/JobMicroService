package com.example.jobproject.Repositories;

import com.example.jobproject.Entities.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job,Integer> {
}
