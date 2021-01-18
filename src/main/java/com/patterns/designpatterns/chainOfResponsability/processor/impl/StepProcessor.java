package com.patterns.designpatterns.chainOfResponsability.processor.impl;

import com.patterns.designpatterns.chainOfResponsability.domain.Ingredient;
import com.patterns.designpatterns.chainOfResponsability.processor.Processor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class StepProcessor implements Processor {

    @Setter
    private StepProcessor nextProcessor;

    protected abstract Ingredient process(Ingredient ingredient);

    @Override
    public void moveForward(Ingredient ingredient) {
        Ingredient cookingFood = process(ingredient);
        if (nextProcessor != null) {
            log.debug("Calling next processor: {}", nextProcessor.getClass().getSimpleName());
            nextProcessor.moveForward(cookingFood);
        }
    }
}
