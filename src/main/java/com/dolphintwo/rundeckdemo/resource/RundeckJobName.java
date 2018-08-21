package com.dolphintwo.rundeckdemo.resource;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Created by dd on 2018/8/21 15:33
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPOJOBuilder
@Document
public class RundeckJobName {
    private String url;
    @Id
    private String name;
    private String description;
    private Jobs jobsList;
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Jobs getJobsList() {
        return jobsList;
    }
    public void setJobsList(Jobs jobsList) {
        this.jobsList = jobsList;
    }
}
