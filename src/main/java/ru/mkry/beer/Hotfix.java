package ru.mkry.beer;
/*
 * No fuck license
 */

import java.math.BigDecimal;

/**
 * A can of beer 0.3L
 *
 * @author Misha Generic, 24.12.2021
 */
public class Hotfix extends Issue {

    public Hotfix() {
        etaHours = new BigDecimal(0.3);
    }

    @Override
    public BigDecimal getEtaHours() {
        return etaHours;
    }

    @Override
    public void setEtaHours(BigDecimal etaHours) {
    }
}
