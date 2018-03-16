/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigestionEntity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.consumer.OffsetAndMetadata;
import org.apache.kafka.common.TopicPartition;

/**
 *
 * @author kanto
 */
public class RebalanceListener implements ConsumerRebalanceListener {

    private KafkaConsumer consumer;
    private Map<TopicPartition, OffsetAndMetadata> currentOffsets = new HashMap();

    public RebalanceListener(KafkaConsumer k) {
        this.consumer = k;
    }

    public void addOffset(String topic, int partition, long offset) {
        currentOffsets.put(new TopicPartition(topic, partition), new OffsetAndMetadata(offset, "Commit"));

    }

    public Map<TopicPartition, OffsetAndMetadata> getCurrentOffsets() {
        return currentOffsets;
    }

    public void onPartitionsAssigned(Collection<TopicPartition> partitions) {
        System.out.println("Following partitions assigned");
        for (TopicPartition p : partitions) {
            System.out.println(p.partition() + ",");
        }
    }

    public void onPartitionsRevoked(Collection<TopicPartition> partitions) {
        System.out.println("Following partitions assigned");
        for (TopicPartition p : partitions) {
            System.out.println(p.partition() + ",");
        }
        
        System.out.println("Following Partitions Commited");
        for(TopicPartition tp : currentOffsets.keySet()){
            System.out.println(tp.partition());
        }
        consumer.commitSync(currentOffsets);
        currentOffsets.clear();
    }

}
