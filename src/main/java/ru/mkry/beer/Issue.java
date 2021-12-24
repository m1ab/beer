package ru.mkry.beer;
/*
 * No fuck license
 */

import java.math.BigDecimal;
import java.util.Objects;

/**
 * A can of beer.
 *
 * @author Misha Generic, 24.12.2021
 */
public class Issue extends Beer {

    /**
     * ETA in Hours is Like a capacity of a can (0.5, 0.45, 0.6, etc.)
     */
    protected BigDecimal etaHours;

    public BigDecimal getEtaHours() {
        return etaHours;
    }

    public void setEtaHours(BigDecimal etaHours) {
        this.etaHours = etaHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Issue)) return false;
        if (!super.equals(o)) return false;
        Issue issue = (Issue) o;
        return Objects.equals(etaHours, issue.etaHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), etaHours);
    }
}
