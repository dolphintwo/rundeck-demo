package com.dolphintwo.rundeckdemo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by dd on 2018/8/21 13:58
 */

@Getter
@Setter
public class ExecutionStart {

    private Long unixtime;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private Date date;

}
