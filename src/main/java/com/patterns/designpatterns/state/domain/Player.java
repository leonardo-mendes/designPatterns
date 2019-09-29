package com.patterns.designpatterns.state.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Player {

    private State state;

    public void changeState(State state) {
        this.state = state;
    }
}
