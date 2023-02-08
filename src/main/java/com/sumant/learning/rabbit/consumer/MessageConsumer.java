package com.sumant.learning.rabbit.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class MessageConsumer {

    @Bean
    public Consumer<String> messageLogger(){
        return message -> {
            log.info("Received message: " + message);
        };
    }
}
