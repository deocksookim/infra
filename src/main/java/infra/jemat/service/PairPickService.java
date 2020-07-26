package infra.jemat.service;

import infra.jemat.Repository.PairRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PairPickService {
    private final PairRepository pairRepository;

    public String getPair() {
        return pairRepository.pickRandomPair();
    }
}
