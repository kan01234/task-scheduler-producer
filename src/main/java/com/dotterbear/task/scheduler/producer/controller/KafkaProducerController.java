package com.dotterbear.task.scheduler.producer.controller;

import java.util.Date;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dotterbear.task.scheduler.producer.dto.TaskDTO;
import com.dotterbear.task.scheduler.producer.kafka.producer.TaskProducer;

@RestController
@RequestMapping(path = "/task")
public class KafkaProducerController {

  @Resource
  private TaskProducer producer;

  @Value("${task.scheduler.producer.topic-name}")
  private String topicName;

  @RequestMapping("/send")
  public String send(TaskDTO taskDto) {
    producer.sendMessage(topicName, taskDto);
    return "send" + taskDto + " ok!, current date: " + new Date();
  }

  @RequestMapping("/health-check")
  public String healthCheck() {
    return null;
  }

}
