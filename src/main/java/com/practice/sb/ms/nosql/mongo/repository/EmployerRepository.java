package com.practice.sb.ms.nosql.mongo.repository;

import com.practice.sb.ms.nosql.mongo.model.Employer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployerRepository extends MongoRepository<Employer,String> {}
