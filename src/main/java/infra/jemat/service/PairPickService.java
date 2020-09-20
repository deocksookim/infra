package infra.jemat.service;

import infra.jemat.Repository.PairRepository;
import infra.jemat.domain.Pair;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class PairPickService {
    private final PairRepository pairRepository;

    public String getPair() {
        new Pair("끝장페어", "010xxxxxxxx", 99);
        randomlyTriggerFullGc();
        return pairRepository.pickRandomPair();
    }

    private void randomlyTriggerFullGc() {
        Random random = new Random();
        int randomPickNumber = random.nextInt(9);
        if (randomPickNumber < 2) {
            System.gc();
        }
    }
}
