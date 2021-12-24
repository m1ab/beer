package ru.mkry.beer;
/*
 * No fuck license
 */

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Its a beer
 *
 * @author Misha Generic, 24.12.2021
 */
public class Beer {
    /**
     * Just a brand name
     */
    protected String name;
    /**
     * Its like a beer strength (4.0, 4.5, 5.0 etc)
     */
    protected BigDecimal complexity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getComplexity() {
        return complexity;
    }

    public void setComplexity(BigDecimal complexity) {
        this.complexity = complexity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Beer)) return false;
        Beer beer = (Beer) o;
        return Objects.equals(name, beer.name) &&
                Objects.equals(complexity, beer.complexity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, complexity);
    }
}
