package ru.mkry.beer;
/*
 * No fuck license
 */

import java.util.Objects;

/**
 * Snack for beer
 *
 * @author Misha Generic, 24.12.2021
 */
public class Snack {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Snack)) return false;
        Snack snack = (Snack) o;
        return Objects.equals(name, snack.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
