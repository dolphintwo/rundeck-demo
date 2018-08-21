package com.dolphintwo.rundeckdemo.resource;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by dd on 2018/8/21 11:09
 */

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPOJOBuilder
@Document
public class RundeckJob {

    private String url;
    @Id
    private String name;
    private String description;
    private List<Jobs> jobsList = new ArrayList<>();
    // private List<Execution> executionsList = new ArrayList<>();

}
