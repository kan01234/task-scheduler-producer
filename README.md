# task-scheduler-producer
[check the repo](https://github.com/kan01234/task-scheduler)

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
