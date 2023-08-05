package com.example.backend.service;

import com.example.backend.entity.Application;
import com.example.backend.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public void saveApplication(Application application){
        applicationRepository.save(application);
    }
}
