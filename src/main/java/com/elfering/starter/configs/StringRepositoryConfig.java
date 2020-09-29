package com.elfering.starter.configs;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;


public class StringRepositoryConfig {
    @Bean
    @Qualifier("stringCountMap")
    public Map<String, Integer> stringCounts() {
        return new HashMap<>();
    }
}
