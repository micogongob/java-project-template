package com.template.javaproject.commons.model;

import java.util.UUID;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationInfoTest {
    @Test
    void shouldMemberFields() {
        ApplicationInfo info = new ApplicationInfo(
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString()
        );

        assertThat(info.getName()).isNotBlank();
        assertThat(info.getDescription()).isNotBlank();
        assertThat(info.getVersion()).isNotBlank();
    }
}