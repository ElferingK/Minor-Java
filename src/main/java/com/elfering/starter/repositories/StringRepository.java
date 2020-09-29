package com.elfering.starter.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class StringRepository {
    private final Map<String, Integer> stringCountMap;

    public StringRepository(@Qualifier("stringCountMap") Map<String, Integer> stringCountMap) {
        this.stringCountMap = stringCountMap;
    }

    public Integer fetchCountWords(String value) {
        return this.stringCountMap.getOrDefault(value, null);
    }

    public Integer addCountWord(String key, int value) {
        this.stringCountMap.put(key, value);
        return value;
    }
}
