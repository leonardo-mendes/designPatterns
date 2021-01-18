package com.patterns.designpatterns.chainOfResponsability.processor;

import com.patterns.designpatterns.chainOfResponsability.domain.Ingredient;

public interface Processor {
    void moveForward(Ingredient ingredient);
}
