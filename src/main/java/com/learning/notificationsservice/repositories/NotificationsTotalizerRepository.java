package com.learning.notificationsservice.repositories;

import com.learning.notificationsservice.model.NotificationsTotalizer;
import org.springframework.data.repository.CrudRepository;

public interface NotificationsTotalizerRepository extends CrudRepository<NotificationsTotalizer, Integer> {

    NotificationsTotalizer findByUserId(Integer userId);
}
