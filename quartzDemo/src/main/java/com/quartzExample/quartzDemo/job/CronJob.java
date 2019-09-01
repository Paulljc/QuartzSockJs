package com.quartzExample.quartzDemo.job;

import com.quartzExample.quartzDemo.controller.QuartzController;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.*;

public class CronJob extends QuartzJobBean {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("User轮询");
        Map map = new HashMap();
        map.put("content", "Bill");

        List list = new ArrayList();
        list.add("password1");
        list.add("password2");

        messagingTemplate.convertAndSendToUser("1", "/sendMessageByServe", list);
    }
}
