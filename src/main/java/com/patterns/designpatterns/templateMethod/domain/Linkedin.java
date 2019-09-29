package com.patterns.designpatterns.templateMethod.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Linkedin extends Network {

    public Linkedin(String userName) {
        super(userName);
    }

    @Override
    public void logToObserver() {
        log.info("Linkedin on.");
    }
}
