package io.github.jbruno37.calendar.domain;

import io.github.jbruno37.core.Ids;

import java.util.UUID;

public record Tarea(UUID id, String titulo) {

    public static Tarea crear(String titulo) {
        return new Tarea(Ids.nuevo(), titulo);
    }
}
