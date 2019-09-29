package com.patterns.designpatterns.state.domain.states;

import com.patterns.designpatterns.state.domain.Player;
import com.patterns.designpatterns.state.domain.State;

public class InsertCoin implements State {

    @Override
    public String onLock() {
        return "The bike is riding.";
    }

    @Override
    public String onPlay() {
        return "The bike will ride in a few minutes.";
    }
}