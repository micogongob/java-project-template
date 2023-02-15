package com.template.javaproject.commons.util;

import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import com.template.javaproject.commons.model.ApplicationInfo;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class JavaProjectUtil {
    private static ApplicationInfo info = new ApplicationInfo(
        "java-project",
        "Java Project",
        "1.0.0"
    );

    public static ApplicationInfo getAppInfo() {
        return info;
    }
}