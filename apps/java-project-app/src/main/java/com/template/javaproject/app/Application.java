package com.template.javaproject.app;

import lombok.extern.slf4j.Slf4j;
import com.template.javaproject.commons.util.JavaProjectUtil;

@Slf4j
public class Application {
    public static void main(String[] args) {
        log.info("App Info: {}", JavaProjectUtil.getAppInfo());
    }
}