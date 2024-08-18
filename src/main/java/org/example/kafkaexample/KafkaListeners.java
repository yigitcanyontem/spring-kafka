package org.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {
    @KafkaListener(topics = "topic1", groupId = "group_id")
    public void listen(MessageRequest message) {
        System.out.println("Received message in group group_id: " + message);
    }

}
