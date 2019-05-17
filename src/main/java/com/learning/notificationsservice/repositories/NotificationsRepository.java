package com.learning.notificationsservice.repositories;

import com.learning.notificationsservice.model.Notification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface NotificationsRepository extends CrudRepository<Notification, Integer> {

}
