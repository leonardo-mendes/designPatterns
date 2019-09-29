package com.patterns.designpatterns.state.domain.states;

import com.patterns.designpatterns.state.domain.Player;
import com.patterns.designpatterns.state.domain.State;

public class WaitYourTime implements State {

    @Override
    public String onLock() {
        return "The bike will stop in a few minutes.";
    }

    @Override
    public String onPlay() {
        return "Wait your time";
    }
}