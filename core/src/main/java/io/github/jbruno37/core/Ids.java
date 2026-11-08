package io.github.jbruno37.core;

import java.util.UUID;

public final class Ids {

    private Ids() {
    }

    public static UUID nuevo() {
        return UUID.randomUUID();
    }
}
