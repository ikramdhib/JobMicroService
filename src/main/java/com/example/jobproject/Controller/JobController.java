package com.example.jobproject.Controller;

import com.example.jobproject.Entities.Job;
import com.example.jobproject.Services.JobService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class JobController {
    public JobService jobService ;
    @PostMapping("/addJob")
    public Job addJob(@RequestBody Job job) {
        return this.jobService.addJob(job);
    }

    @GetMapping("/getAll")
    public List<Job> gelAllJobs() {
        return  this.jobService.gelAllJobs();
    }

    @GetMapping("/getJob/{id}/{nom}")
    public Job getJobWithIdNom(@PathVariable int id, @PathVariable String nom) {
            return this.jobService.getJobWithIdNom(id,nom) ;

    }

}
