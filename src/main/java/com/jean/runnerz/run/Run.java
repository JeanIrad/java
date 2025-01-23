package com.jean.runnerz.run;

import java.time.LocalDateTime;


public record Run(
Integer id,
String title,
String description,
String duration,
Integer distance,
LocalDateTime startedOn,
LocalDateTime completedOn,
Location location
) {

}
