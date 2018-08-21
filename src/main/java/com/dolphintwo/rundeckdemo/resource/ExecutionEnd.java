package com.dolphintwo.rundeckdemo.resource;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by dd on 2018/8/21 13:57
 */

@Getter
@Setter
public class ExecutionEnd {

    private Long unixtime;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;




}
