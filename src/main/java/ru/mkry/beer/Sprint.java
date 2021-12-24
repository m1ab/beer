package ru.mkry.beer;
/*
 * No fuck license
 */

import java.util.Objects;

/**
 * A pack of beer
 *
 * @author Misha Generic, 24.12.2021
 * @param <T> beer type
 */
public class Sprint<T extends Generic> {

    protected T generic;
    protected int count;

    public T getGeneric() {
        return generic;
    }

    public void setGeneric(T generic) {
        this.generic = generic;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Sprint)) return false;
        Sprint<?> sprint = (Sprint<?>) o;
        return count == sprint.count &&
                Objects.equals(generic, sprint.generic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(generic, count);
    }
}
