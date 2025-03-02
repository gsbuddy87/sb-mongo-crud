package com.practice.sb.ms.nosql.mongo.controler;

import com.practice.sb.ms.nosql.mongo.model.Employer;
import com.practice.sb.ms.nosql.mongo.service.EmployerSvc;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employer")
public class EmployerController {

    private final EmployerSvc service;

    public EmployerController(EmployerSvc service) {
        this.service = service;
    }

    @GetMapping
    public List<Employer> getAllEmployers() {
        return service.getAllEmployers();
    }

    @GetMapping("/{id}")
    public Employer getEmployerById(@PathVariable String id) {
        return service.getEmployerById(id);
    }

    @PostMapping
    public Employer createEmployer(@RequestBody Employer Employer) {
        return service.createEmployer(Employer);
    }

    @PutMapping("/{id}")
    public Employer updateEmployer(@PathVariable String id, @RequestBody Employer Employer) {
        return service.updateEmployer(id, Employer);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployer(@PathVariable String id) {
        service.deleteEmployer(id);
    }    
}
