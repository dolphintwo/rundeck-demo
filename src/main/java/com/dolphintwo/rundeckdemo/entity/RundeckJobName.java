package com.dolphintwo.rundeckdemo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Created by dd on 2018/8/21 15:33
 */

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPOJOBuilder
@Document
public class RundeckJobName {
    private String url;
    @Id
    private String name;
    private String description;
    private Jobs jobsList;

}
