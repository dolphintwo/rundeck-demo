package com.dolphintwo.rundeckdemo.resource;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
/**
 * Created by dd on 2018/8/21 13:56
 */

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Executions {

    private int id;
    private String href;
    private Boolean status;
    private String project;
    @SerializedName("date-started")
    private ExecutionStart dateStarted;
    @SerializedName("date-ended")
    private ExecutionEnd dateEended;
    private String user;
    //private Jobs job;
    private Nodes nodes;

}