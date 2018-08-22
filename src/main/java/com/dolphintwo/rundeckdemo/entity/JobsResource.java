package com.dolphintwo.rundeckdemo.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by dd on 2018/8/21 15:38
 */
@Getter
@Setter
public class JobsResource {
    private String id;
    private String name;
    private String project;
    private String group;
    private Boolean scheduled;
    private String href;
    private String revisionID;
    private String deployedBy;
    private String env;
    private Executions executionsList;

}
