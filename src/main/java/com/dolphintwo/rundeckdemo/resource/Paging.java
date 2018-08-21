package com.dolphintwo.rundeckdemo.resource;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by dd on 2018/8/21 14:03
 */

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown=true)
public class Paging {

    private int count;
    private int total;
    private int offset;
    private int max;

}
