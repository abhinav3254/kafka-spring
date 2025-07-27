abhinavkumar@Abhinavs-MacBook-Air kafka_2.13-3.5.1 % bin/kafka-console-consumer.sh --topic location-update-topic --from-beginning --bootstrap-server localhost:9092

use the above command to subscribe the delivery boy location and printing it in the console

----- The below commands are for kafka console --------

bin/kafka-console-consumer.sh --topic user-topic --from-beginning --bootstrap-server localhost:9092
this is for consumer

bin/kafka-console-producer.sh --topic user-topic --bootstrap-server localhost:9092
this above command is for producer


this below command is to start kafka
abhinavkumar@Abhinavs-MacBook-Air kafka_2.13-3.5.1 % bin/kafka-server-start.sh config/server.properties


this below command is to start zookeepar
abhinavkumar@Abhinavs-MacBook-Air kafka_2.13-3.5.1 % bin/zookeeper-server-start.sh config/zookeeper.properties
