package com.dotterbear.task.scheduler.producer.kafka.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import com.dotterbear.task.scheduler.producer.dto.TaskDTO;

@Component
public class TaskProducer {
  private static final Logger logger = LoggerFactory.getLogger(TaskProducer.class);

  @Autowired
  private KafkaTemplate<String, TaskDTO> kafkaTemplate;

  public void sendMessage(String topicName, TaskDTO taskDto) {
    logger.debug("send msg, topicName: {}, data: {}", topicName, taskDto);
    try {
      kafkaTemplate.send(topicName, taskDto);
      logger.debug("send ok");
    } catch (Exception e) {
      logger.error("unable to send msg, topicName: {}, data: {}", topicName, taskDto, e);
    }
  }

}
