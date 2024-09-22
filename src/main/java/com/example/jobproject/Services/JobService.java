package com.example.jobproject.Services;

import com.example.jobproject.Entities.Job;
import com.example.jobproject.Repositories.JobRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class JobService implements IJobService {

    JobRepository jobRepository ;
    @Override
    public Job addJob(Job job) {
        return this.jobRepository.save(job);
    }

    @Override
    public List<Job> gelAllJobs() {
        return (List<Job>) this.jobRepository.findAll();
    }

    @Override
    public Job getJobWithIdNom(int id, String nom) {
        if(id==0){
            return this.jobRepository.findByServiceLike(nom) ;
        }
        return this.jobRepository.findById(id).orElse(null);
    }
}
