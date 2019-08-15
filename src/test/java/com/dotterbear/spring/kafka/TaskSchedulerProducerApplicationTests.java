package com.dotterbear.spring.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.dotterbear.task.scheduler.producer.TaskSchedulerProducerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TaskSchedulerProducerApplication.class)
public class TaskSchedulerProducerApplicationTests {

	@Test
	public void contextLoads() {
	}

}
