package com.dolphintwo.rundeckdemo.entity;


import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by dd on 2018/8/21 14:02
 */

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Execution {

    private Paging paging;
    private List<Executions> executions = new ArrayList<>();
}
