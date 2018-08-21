package com.dolphintwo.rundeckdemo.resource;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by dd on 2018/8/21 13:57
 */


public class ExecutionEnd {

    private Long unixtime;
    public Long getUnixtime() {
        return unixtime;
    }

    public void setUnixtime(Long unixtime) {
        this.unixtime = unixtime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



}
