package com.patterns.designpatterns.chainOfResponsability.domain;

public interface Ingredient {

    void changeStatus(Boolean status);

    String getStatus();
}
