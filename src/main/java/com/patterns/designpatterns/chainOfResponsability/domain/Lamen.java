package com.patterns.designpatterns.chainOfResponsability.domain;

import lombok.Builder;

@Builder
public class Lamen implements Ingredient {

    private Boolean ready;

    @Override
    public void changeStatus(Boolean status) {
        this.ready = status;
    }

    @Override
    public String getStatus() {
        return ready.toString();
    }
}
