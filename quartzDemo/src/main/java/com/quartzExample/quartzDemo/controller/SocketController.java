package com.quartzExample.quartzDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@EnableScheduling
public class SocketController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

//    @Scheduled(fixedRate = 3000)
//    public void sendMessageToUser() {
//        System.out.println("User轮询");
//        Map map = new HashMap();
//        map.put("content", "Bill");
//
//        List list = new ArrayList();
//        list.add("password1");
//        list.add("password2");
//
//        messagingTemplate.convertAndSendToUser("1", "/sendMessageByServe", list); //  /user/1/sendMessageByServe
//    }
}
