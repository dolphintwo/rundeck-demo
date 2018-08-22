package com.dolphintwo.rundeckdemo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.dolphintwo.rundeckdemo.entity.RundeckJob;

/**
 * Created by dd on 2018/8/21 15:32
 */

public interface RundeckJobRepository extends PagingAndSortingRepository<RundeckJob,String> {
    RundeckJob findAllByName(String name);

    //@Query("SELECT rJob " + "FROM RundeckJob rJob LEFT JOIN Jobs jobs LEFT JOIN Executions executions " + "WHERE jobs.project = executions.project AND rJob.project = jobs.project AND executions.dateStarted.date = :date ")
    //RundeckJob findAllByDate(@Param("date") Date date);

    //@Query("SELECT rJob " + "FROM RundeckJob rJob LEFT JOIN Jobs jobs " + "WHERE rJob.project = jobs.project")
    RundeckJob findByName(String name);

}
