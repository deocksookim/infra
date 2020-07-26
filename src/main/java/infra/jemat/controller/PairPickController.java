package infra.jemat.controller;

import infra.jemat.service.PairPickService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PairPickController {
    private final PairPickService pairPickService;

    @GetMapping("/who/is/my/pair")
    public String pickPair() {
        return pairPickService.getPair();
    }
}
