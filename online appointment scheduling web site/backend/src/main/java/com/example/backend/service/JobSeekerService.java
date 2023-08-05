package com.example.backend.service;

import com.example.backend.entity.JobSeeker;
import com.example.backend.repository.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class JobSeekerService {
    @Autowired
    private JobSeekerRepository jobSeekerRepository;

    public void saveJobSeeker(JobSeeker jobSeeker){
        jobSeekerRepository.save(jobSeeker);
    }
}
