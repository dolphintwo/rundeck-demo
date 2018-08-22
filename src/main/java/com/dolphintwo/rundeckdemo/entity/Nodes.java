package com.dolphintwo.rundeckdemo.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by dd on 2018/8/21 13:59
 */

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Nodes {

    private int id;
    private Boolean status;
    private List<String> failedNodes;
    private List<String> successfulNodes;

}
