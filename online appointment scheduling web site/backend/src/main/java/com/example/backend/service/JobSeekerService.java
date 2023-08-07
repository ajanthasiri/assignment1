package com.example.backend.service;

import com.example.backend.entity.JobSeeker;
import com.example.backend.repository.JobSeekerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

@Service
@Transactional
public class JobSeekerService {
    @Autowired
    private JobSeekerRepository jobSeekerRepository;

    public JobSeeker saveJobSeeker(String name, String email, String country, LocalDate dob,
                              MultipartFile cv) throws IOException {
        JobSeeker jobSeeker = new JobSeeker();
        jobSeeker.setName(name);
        jobSeeker.setEmail(email);
        jobSeeker.setDob(dob);
        jobSeeker.setBirthCountry(country);
        File path = new File("C:\\cv\\" + cv.getOriginalFilename()); // set the save path
        cv.transferTo(path);
        jobSeeker.setCv(path.getPath());
        return jobSeekerRepository.save(jobSeeker);
    }
}
