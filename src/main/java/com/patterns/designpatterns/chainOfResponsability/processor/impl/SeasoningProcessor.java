package com.patterns.designpatterns.chainOfResponsability.processor.impl;

import com.patterns.designpatterns.chainOfResponsability.domain.Ingredient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SeasoningProcessor extends StepProcessor{

    @Override
    protected Ingredient process(Ingredient ingredient) {
        log.info("Adding spices on the lamen.");
        return ingredient;
    }

}
