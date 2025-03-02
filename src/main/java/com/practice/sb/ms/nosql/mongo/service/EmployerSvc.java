package com.practice.sb.ms.nosql.mongo.service;

import com.practice.sb.ms.nosql.mongo.model.Employer;
import com.practice.sb.ms.nosql.mongo.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerSvc {
    @Autowired
    private EmployerRepository repository;

    public List<Employer> getAllEmployers() {
        return repository.findAll();
    }

    public Employer getEmployerById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Employer createEmployer(Employer employer) {
        return repository.save(employer);
    }

    public Employer updateEmployer(String id, Employer employer) {
        Employer existingEmployer = repository.findById(id).orElse(null);
        if (existingEmployer != null) {
            existingEmployer.setName(employer.getName());
            existingEmployer.setDomain(employer.getDomain());
            existingEmployer.setRevenue(employer.getRevenue());
            return repository.save(existingEmployer);
        }
        return null;
    }

    public void deleteEmployer(String id) {
        repository.deleteById(id);
    }
}
