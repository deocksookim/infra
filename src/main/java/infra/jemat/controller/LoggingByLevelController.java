package infra.jemat.controller;

import infra.jemat.service.LoggingByLevelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LoggingByLevelController {
    private final LoggingByLevelService loggingByLevelService;

    @GetMapping("/log/info")
    public String logInfo() {
        return loggingByLevelService.logInfoLevelLog();
    }

    @GetMapping("/log/warn")
    public String logWarn() {
        return loggingByLevelService.logWarnLevelLog();
    }

    @GetMapping("/log/trace")
    public String logTrace() {
        return loggingByLevelService.logTraceLevelLog();
    }

    @GetMapping("/log/debug")
    public String logDebug() {
        return loggingByLevelService.logDebugLevelLog();
    }

    @GetMapping("/log/error")
    public String logError() {
        return loggingByLevelService.logErrorLevelLog();
    }
}
