package com.dolphintwo.rundeckdemo.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by dd on 2018/8/21 11:13
 */

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Jobs {

    private String id;
    private String name;
    private String project;
    private String group;
    private Boolean scheduled;
    private String href;
    private String revisionID;
    private String deployedBy;
    private String env;
    private List<Executions> executionsList = new ArrayList<>();

}
