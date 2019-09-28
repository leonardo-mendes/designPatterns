package com.patterns.designpatterns.strategy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class Car implements TicketValue{

    private static final Double cost = 3.00;

    @Override
    public Double ticketCalculate(Integer quantity) {
        return cost*quantity;
    }
}
