package infra.jemat.controller;

import infra.jemat.service.PairService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PairPickController {
    private final PairService pairService;

    @GetMapping("/who/is/my/pair")
    public String pickPair() {
        return pairService.getPair();
    }
}
