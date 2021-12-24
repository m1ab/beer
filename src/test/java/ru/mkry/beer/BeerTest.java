package ru.mkry.beer;

/*
 * No fuck license
 */

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Beer test for sure. We have TDD actually
 *
 * @author Misha Generic, 24.12.2021
 */
public class BeerTest {

    @Test
    public void testGetName() {
        Beer beer = new Beer();
        Assert.assertNull(beer.getName());
        beer.setName("Name");
        Assert.assertEquals("Name", beer.getName());
    }

    @Test
    public void testSetName() {
        Beer beer = new Beer();
        beer.setName("Name");
        Assert.assertEquals("Name", beer.getName());
    }

    @Test
    public void testGetComplexity() {
        Beer beer = new Beer();
        Assert.assertNull(beer.getComplexity());
        BigDecimal expected = new BigDecimal(5.0);
        beer.setComplexity(expected);
        Assert.assertEquals(expected, beer.getComplexity());
    }

    @Test
    public void testSetComplexity() {
        Beer beer = new Beer();
        BigDecimal expected = new BigDecimal(5.0);
        beer.setComplexity(expected);
        Assert.assertEquals(expected, beer.getComplexity());
    }

    @Test
    public void testEquals() {
        Beer beer1 = new Beer();
        beer1.setName("Name");
        beer1.setComplexity(new BigDecimal(5.0));
        Beer beer2 = new Beer();
        beer2.setName("Name");
        beer2.setComplexity(new BigDecimal(5.0));
        Assert.assertTrue(beer1.equals(beer2));
        Assert.assertFalse(beer1.equals(new Beer()));
        Assert.assertFalse(beer1.equals(null));
        Assert.assertFalse(beer1.equals(new Object()));
    }

    @Test
    public void testHashCode() {
        Beer beer1 = new Beer();
        beer1.setName("Name");
        beer1.setComplexity(new BigDecimal(5.0));
        int hashCode1 = beer1.hashCode();
        Beer beer2 = new Beer();
        beer2.setName("Name");
        beer2.setComplexity(new BigDecimal(5.0));
        int hashCode2 = beer2.hashCode();
        Assert.assertTrue(hashCode1 == hashCode2);
    }
}