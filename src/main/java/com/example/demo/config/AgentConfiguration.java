package com.example.demo.config;

import com.example.demo.model.Agent;
import com.example.demo.repository.AgentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AgentConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(AgentRepository agentRepository) {
        return args -> {
            agentRepository.saveAll(Arrays.asList(
                    new Agent("Tom Hardy", 2000, 12),
                    new Agent("Tony Mathews", 1500, 5),
                    new Agent("Marco Berans", 1200, 7),
                    new Agent("Bill Russel", 3400, 15)
            ));
        };
    }
}