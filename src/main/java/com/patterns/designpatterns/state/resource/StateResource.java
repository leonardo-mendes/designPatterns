package com.patterns.designpatterns.state.resource;


import com.patterns.designpatterns.state.domain.Player;
import com.patterns.designpatterns.state.domain.states.InsertCoin;
import com.patterns.designpatterns.state.domain.states.WaitYourTime;
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
@RequestMapping(value = "/bikes")
public class StateResource {

    private Player player;

    @PostMapping(value = "/start")
    @ResponseStatus(code = HttpStatus.OK)
    public String insertCoin() {
        player= new Player(new InsertCoin());
        log.info(player.getState().onLock());
        player.changeState(new WaitYourTime());
        log.info(player.getState().onLock());
        return player.getState().onPlay();
    }

    @PostMapping(value = "/next")
    @ResponseStatus(code = HttpStatus.OK)
    public String waitCoin() {
        player= new Player(new WaitYourTime());
        log.info(player.getState().onLock());
        player.changeState(new InsertCoin());
        log.info(player.getState().onLock());
        return player.getState().onPlay();
    }
}
