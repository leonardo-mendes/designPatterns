package com.patterns.designpatterns.chainOfResponsability.service;

import com.patterns.designpatterns.chainOfResponsability.processor.impl.SeasoningProcessor;
import com.patterns.designpatterns.chainOfResponsability.processor.impl.ServeTheFoodProcessor;
import com.patterns.designpatterns.chainOfResponsability.processor.impl.StepProcessor;
import com.patterns.designpatterns.chainOfResponsability.processor.impl.WaterProcessor;
import org.springframework.stereotype.Service;

@Service
public class CookService {

    public StepProcessor runProcess(){
        WaterProcessor waterProcessor = new WaterProcessor();
        SeasoningProcessor seasoningProcessor = new SeasoningProcessor();
        ServeTheFoodProcessor serveTheFoodProcessor = new ServeTheFoodProcessor();

        waterProcessor.setNextProcessor(seasoningProcessor);
        seasoningProcessor.setNextProcessor(serveTheFoodProcessor);
        return waterProcessor;
    }

}
