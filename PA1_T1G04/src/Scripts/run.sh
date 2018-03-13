#!/bin/bash

cd ..
cd ..

kafka_2.11-1.0.1/bin/zookeeper-server-start.sh kafka_2.11-1.0.1/config/zookeeper.properties | 
kafka_2.11-1.0.1/bin/kafka-server-start.sh kafka_2.11-1.0.1/config/server.properties |
kafka_2.11-1.0.1/bin/kafka-server-start.sh kafka_2.11-1.0.1/config/server-1.properties
