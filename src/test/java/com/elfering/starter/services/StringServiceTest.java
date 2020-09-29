package com.elfering.starter.services;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.junit.jupiter.api.Test;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class StringServiceTest {
    @InjectMocks
    StringService stringService;

    @Test
    void testCapsMethod() {
        final var capsString = stringService.caps("test");
        Assertions.assertThat(capsString).isEqualTo("TEST");
    }

    @Test
    void testRevereseMethod() {
        final var reverseString = stringService.reverse("test");
        Assertions.assertThat(reverseString).isEqualTo("tset");
    }
}
