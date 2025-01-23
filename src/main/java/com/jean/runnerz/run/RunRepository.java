package com.jean.runnerz.run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;

public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    public List<Run> findAll() {
        return runs;
    }
 
    @PostConstruct
    private void init() {
        runs.add(new Run(1, "Morning Run", "Morning run in the park", "30 minutes", 5, LocalDateTime.now(), LocalDateTime.now().plus(2, ChronoUnit.HOURS), Location.OUTDOOR));
        runs.add(new Run(2, "Evening Run", "Evening run in the park", "30 minutes", 5, LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.DAYS), Location.OUTDOOR));
    }
    public Run findById(Integer id) {
        return runs.stream().filter(run -> run.id().equals(id)).findFirst().orElse(null);
    }
}
