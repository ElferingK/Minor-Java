package com.elfering.starter.services;

import com.elfering.starter.repositories.StringRepository;
import org.springframework.stereotype.Service;

@Service
public class StringService {

    protected final StringRepository stringRepository;

    public StringService(StringRepository stringRepository) {
        this.stringRepository = stringRepository;
    }

    public String reverse(String value) {
        StringBuilder stringBuilder = new StringBuilder(value != null ? value : "");
        return stringBuilder.reverse().toString();
    }

    public String caps(String value) {
        return value.toUpperCase();
    }

    public int count(String value) {
        if (value == null || value.isBlank()) {
            return 0;
        }
        return value.split("\\s+").length;
    }
}
