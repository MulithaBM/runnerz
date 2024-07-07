package com.learning.runnerz.run;

import jakarta.validation.constraints.Positive;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.time.LocalDateTime;

public record Run(
        @Id
        Integer id,
        String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        @Positive
        Integer distance,
        Location location,
        @Version
        Integer version
) {

    public Run {
        if (completedOn.isBefore(startedOn)) {
            throw new IllegalArgumentException("Completed time cannot be before the started time");
        }
    }
}
