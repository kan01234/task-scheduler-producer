# task-scheduler-producer
Part of the implementation of task scheduler system, please check this [project](https://github.com/kan01234/task-scheduler) for more information.

[docker image](https://cloud.docker.com/u/safghjkl/repository/docker/safghjkl/task-scheduler-producer)
## Quick Start
1. create docker network
```bash
docker network create task-scheduler-network;
```

2. start Kafka
```bash
export DOCKER_KAFKA_HOST=$(ipconfig getifaddr en0);
cd ./kafka-docker;
docker-compose rm -svf; docker-compose up;
```

3. start application
```bash
mvn clean package;
docker-compose up;
```

### Add Schedule Task
```bash
curl "http://localhost/task/send?execTs=2019-08-07T21:45:00.000%2B08:00&data=bbbbbb"
# add schedule task on 2019-08-07T21:45:00.000+8:00 with data "bbbbbbb"
```
