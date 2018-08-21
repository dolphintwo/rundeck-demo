package com.dolphintwo.rundeckdemo.resource;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Created by dd on 2018/8/21 13:58
 */


public class ExecutionStart {

    private Long unixtime;
    public Long getUnixtime() {
        return unixtime;
    }
    public void setUnixtime(Long unixtime) {
        this.unixtime = unixtime;
    }
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private Date date;



    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }


}
