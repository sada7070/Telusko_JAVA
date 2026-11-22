package com.example.spring_boot_rest.repo;

import com.example.spring_boot_rest.model.JobPost;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}


//    public List<JobPost> getAllJobs() {
//        return jobs;
//    }
//
//    public void addJob(JobPost job) {
//        jobs.add(job);
//        System.out.println(jobs);
//    }
//
//    public JobPost getJobPost(int postId) {
//        for(JobPost job : jobs) {
//            if(job.getPostId() == postId) {
//                return job;
//            }
//        }
//        return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        boolean found = false;
//
//        for(JobPost currentJob : jobs) {
//            if(currentJob.getPostId() == jobPost.getPostId()) {
//                found = true;
//
//                currentJob.setPostDesc(jobPost.getPostDesc());
//                currentJob.setPostProfile(jobPost.getPostProfile());
//                currentJob.setPostTechStack(jobPost.getPostTechStack());
//                currentJob.setReqExperience(jobPost.getReqExperience());
//            }
//        }
//
//        if(!found) {
//            throw new RuntimeException("Job ID " + jobPost.getPostId() + " not found");
//        }
//    }
//
//    public void deleteJob(int postId) {
//        boolean found = false;
//
//        for(JobPost currentJob : jobs) {
//            if(currentJob.getPostId() == postId) {
//                found = true;
//
//                jobs.remove(currentJob);
//            }
//        }
//
//        if(!found) {
//            throw new RuntimeException("Job ID " + postId + " not found");
//        }
//    }
//
