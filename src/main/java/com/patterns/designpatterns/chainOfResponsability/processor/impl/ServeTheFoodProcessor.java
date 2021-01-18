package com.patterns.designpatterns.chainOfResponsability.processor.impl;

import com.patterns.designpatterns.chainOfResponsability.domain.Ingredient;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServeTheFoodProcessor extends StepProcessor{

    @Override
    protected Ingredient process(Ingredient ingredient) {
        ingredient.changeStatus(Boolean.TRUE);
        log.info("Lamen is ready? {}.", ingredient.getStatus());
        log.info("Serving the lamen.");
        return ingredient;
    }

}
