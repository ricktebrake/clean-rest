package nl.ricktebrake.clean.model;

import lombok.Data;

import java.io.Serializable;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

@Data
public class Task implements Serializable {

    private String name;
    private Duration duration;
    private Period recurrence;
    private LocalDateTime lastExecuted;
}
