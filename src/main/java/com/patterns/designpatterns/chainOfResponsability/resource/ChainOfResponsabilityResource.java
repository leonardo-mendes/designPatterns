package com.patterns.designpatterns.chainOfResponsability.resource;


import com.patterns.designpatterns.chainOfResponsability.domain.Lamen;
import com.patterns.designpatterns.chainOfResponsability.service.CookService;
import com.patterns.designpatterns.state.domain.Player;
import com.patterns.designpatterns.state.domain.states.InsertCoin;
import com.patterns.designpatterns.state.domain.states.WaitYourTime;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/lamens")
@RequiredArgsConstructor
public class ChainOfResponsabilityResource {

    private final CookService cookService;

    @PostMapping(value = "/start")
    @ResponseStatus(code = HttpStatus.OK)
    public void cookLamen() {
        cookService.runProcess().moveForward(Lamen.builder().build());
    }
}
