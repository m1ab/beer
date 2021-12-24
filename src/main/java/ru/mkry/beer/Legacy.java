package ru.mkry.beer;
/*
 * No fuck license
 */

import java.util.Objects;

/**
 * Beer an a PAT
 *
 * @author Misha Generic, 24.12.2021
 */
public class Legacy extends Beer {

    /**
     * Strings like liters 1L, 1.35L, 1.5L, 2L etc
     */
    private int strings;

    public Legacy() {
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Legacy)) return false;
        if (!super.equals(o)) return false;
        Legacy legacy = (Legacy) o;
        return strings == legacy.strings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), strings);
    }
}
