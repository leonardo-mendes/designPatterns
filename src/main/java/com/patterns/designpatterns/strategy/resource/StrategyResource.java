package com.patterns.designpatterns.strategy.resource;


import com.patterns.designpatterns.strategy.domain.Bus;
import com.patterns.designpatterns.strategy.domain.Car;
import com.patterns.designpatterns.strategy.domain.TicketValue;
import com.patterns.designpatterns.strategy.resource.request.QuantityRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/tickets")
public class StrategyResource {

    private TicketValue ticketValue;

    @PostMapping(value = "/car")
    @ResponseStatus(code = HttpStatus.OK)
    public Double ticketCar(QuantityRequest quantityRequest) {
        ticketValue = Car.builder().build();
        log.info("I'll calculate a ticket car.");
        return ticketValue.ticketCalculate(quantityRequest.getQuantity());
    }

    @PostMapping(value = "/bus")
    @ResponseStatus(code = HttpStatus.OK)
    public Double ticketBus(QuantityRequest quantityRequest) {
        ticketValue = Bus.builder().build();
        log.info("I'll calculate a ticket bus.");
        return ticketValue.ticketCalculate(quantityRequest.getQuantity());
    }
}
