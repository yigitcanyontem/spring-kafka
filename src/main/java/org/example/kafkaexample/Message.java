package org.example.kafkaexample;

import java.time.LocalDateTime;

public record Message (String message, LocalDateTime timestamp){
}
