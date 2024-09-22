package com.example.jobproject.Services;

import com.example.jobproject.Entities.Job;

import java.util.List;

public interface IJobService {

    Job addJob(Job job);

    List<Job> gelAllJobs();

    Job getJobWithIdNom(int id, String nom);
}
