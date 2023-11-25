package com.template.javaproject.app;

import lombok.extern.slf4j.Slf4j;
import com.template.javaproject.commons.util.JavaProjectHelper;

@Slf4j
public class Application {

    private static JavaProjectHelper helper;

    static {
        helper = new JavaProjectHelper();
    }

    public static void main(String[] args) {
        var info = helper.getAppInfo();
        log.info("App Info: {}", info);
    }

    public static void setHelper(JavaProjectHelper helper) {
        Application.helper = helper;
    }
}