package infra.jemat.service;

import infra.jemat.Repository.PairRepository;
import infra.jemat.domain.Pair;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PairPickService {
    private final PairRepository pairRepository;

    public String getPair() {
        new Pair("끝장페어", "010xxxxxxxx", 99);
        return pairRepository.pickRandomPair();
    }
}
