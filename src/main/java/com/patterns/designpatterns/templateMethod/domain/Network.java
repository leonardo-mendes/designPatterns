package com.patterns.designpatterns.templateMethod.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Network {

    String userName;

    public String post(String message) {
        return message;
    }

    public String createMessage(String socialMedia) {
        return "Hello " + userName + ", now you are connected on "+socialMedia+".";
    };

    public abstract void logToObserver();
}
