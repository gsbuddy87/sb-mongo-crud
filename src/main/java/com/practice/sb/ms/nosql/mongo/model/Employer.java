package com.practice.sb.ms.nosql.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Map;

@Document(collection = "employers")
@Data
public class Employer {
    @Id
    private String id;
    private String name;
    @Field("domain")
    private Map<String, String> domain;
    private double revenue;
}
