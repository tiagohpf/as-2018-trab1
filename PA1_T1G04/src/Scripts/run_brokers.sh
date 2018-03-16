#!/bin/bash

cd ..
cd ..

kafka_2.11-1.0.1/bin/kafka-server-start.sh kafka_2.11-1.0.1/config/server.properties &
kafka_2.11-1.0.1/bin/kafka-server-start.sh kafka_2.11-1.0.1/config/server-1.properties &
kafka_2.11-1.0.1/bin/kafka-server-start.sh kafka_2.11-1.0.1/config/server-2.properties &
kafka_2.11-1.0.1/bin/kafka-server-start.sh kafka_2.11-1.0.1/config/server-3.properties &
