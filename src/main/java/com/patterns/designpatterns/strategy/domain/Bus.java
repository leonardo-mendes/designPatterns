package com.patterns.designpatterns.strategy.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class Bus implements TicketValue{

    private static final Double cost = 2.00;

    @Override
    public Double ticketCalculate(Integer quantity) {
        return cost*quantity;
    }
}
