package com.patterns.designpatterns.chainOfResponsability.processor.impl;

import com.patterns.designpatterns.chainOfResponsability.domain.Ingredient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WaterProcessor extends StepProcessor{

    @Override
    protected Ingredient process(Ingredient ingredient) {
        log.info("Adding water to boiling the lamen.");
        ingredient.changeStatus(Boolean.FALSE);
        log.info("Lamen is ready? {}.", ingredient.getStatus());
        return ingredient;
    }

}
