package com.example.spring_boot_rest;

import com.example.spring_boot_rest.model.JobPost;
import com.example.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")             // GET method
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{postId}")     // GET method
    public JobPost getJob(@PathVariable("postId") int postId) {
        return service.getJobPost(postId);
    }

    @PostMapping("jobPost")             // POST method
    public void addJob(@RequestBody JobPost jobPost) {
        service.addJob(jobPost);
    }

    @PutMapping("jobPost")
    public void updateJob(@RequestBody JobPost jobPost) {
        service.updateJob(jobPost);
    }

    @DeleteMapping("jobPost/{postId}")
    public void deleteJob(@PathVariable("postId") int postId) {
        service.deleteJob(postId);
    }

    @GetMapping("load")
    public void loadData() {
        service.loadData();
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return service.search(keyword);
    }
}
