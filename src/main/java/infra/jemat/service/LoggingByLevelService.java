package infra.jemat.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoggingByLevelService {

    public String logInfoLevelLog() {
        log.info("info level");
        return "info";
    }

    public String logWarnLevelLog() {
        log.warn("warn level");
        return "warn";
    }

    public String logTraceLevelLog() {
        log.trace("trace");
        return "trace";
    }

    public String logDebugLevelLog() {
        log.debug("debug");
        return "debug";
    }

    public String logErrorLevelLog() {
        log.error("error : ", new RuntimeException("Some message"));
        return "error";
    }
}
