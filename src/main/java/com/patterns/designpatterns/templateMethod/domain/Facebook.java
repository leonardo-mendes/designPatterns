package com.patterns.designpatterns.templateMethod.domain;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class Facebook extends Network {

    public Facebook(String userName) {
        super(userName);
    }

    @Override
    public void logToObserver() {
        log.info("Facebook on.");
    }
}
