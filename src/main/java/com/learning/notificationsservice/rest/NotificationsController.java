package com.learning.notificationsservice.rest;

import com.learning.notificationsservice.model.NotificationsTotalizer;
import com.learning.notificationsservice.repositories.NotificationsRepository;
import com.learning.notificationsservice.repositories.NotificationsTotalizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationsController {

    @Autowired
    private NotificationsTotalizerRepository notificationsTotalizerRepository;

    @RequestMapping(
            value = "/notifications/total",
            method = RequestMethod.GET
    )
    public Integer getTotalNotifications() {
        NotificationsTotalizer totalizer = notificationsTotalizerRepository.findByUserId(1);

        if(null == totalizer) {
            return 0;
        }

        return totalizer.getTotal();

    }

}
