package infra.jemat.Repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class PairRepository {
    private static final int VICTIM = 0;
    private static List<String> pairPool = new ArrayList<>(
        Arrays.asList(
            "김규남",
            "박우빈",
            "구미향",
            "김명재",
            "김민지",
            "김성훈",
            "김지우",
            "서주원",
            "유태식",
            "이성훈",
            "장재주",
            "조광일"
        )
    );

    public String pickRandomPair() {
        Collections.shuffle(pairPool);
        return pairPool.get(VICTIM);
    }
}
