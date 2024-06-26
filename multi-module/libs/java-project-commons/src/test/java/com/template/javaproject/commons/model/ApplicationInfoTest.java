package com.template.javaproject.commons.model;

import java.util.UUID;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationInfoTest {
    @Test
    void shouldMemberFields() {
        // given
        ApplicationInfo info = new ApplicationInfo(
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString()
        );

        // expect
        assertThat(info.name()).isNotBlank();
        assertThat(info.description()).isNotBlank();
        assertThat(info.version()).isNotBlank();
    }
}
