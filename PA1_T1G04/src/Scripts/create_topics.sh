#!/bin/bash

cd ..
cd ..

kafka_2.11-1.0.1/bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 2 --partitions 1 --topic EnrichTopic
kafka_2.11-1.0.1/bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 2 --partitions 1 --topic EnrichedTopic1
kafka_2.11-1.0.1/bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 2 --partitions 1 --topic EnrichedTopic2
kafka_2.11-1.0.1/bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 2 --partitions 1 --topic EnrichedTopic3
