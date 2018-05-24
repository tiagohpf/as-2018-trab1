# Centralized Control Platform with KAFKA

Implementation of a centralized control plataform, using [KAFKA](https://kafka.apache.org/) to supervise the status of cars. Periodically, each car sends information
which is collected and processed by this plataform.

## Structure of the Project
The root of the project is PA1_T1G04. Inside this directory are the KAFKA's library (kafka_2.11-1.0.1) and the src directory where is all the
source-code and text files.

## How to Run
1. Clean and build the project
2. Open terminal on Scripts directory and then run:
	- Run star_zookeeper.sh
	- Run run_brokers.sh
	- Run create_topics.sh
3. Run all the entities
