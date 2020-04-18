package com.divya;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerTest {
    private Power power;

    @Before
    public void setUp() {
        power = new Power();
    }

    @Test
    public void shouldComputePowerNToTheGivenNumberX() {
        int actualResponse = power.pow(2, 3);

        assertEquals(8, actualResponse);
    }

    @Test
    public void shouldReturnOneIfZeroPowerIsRaiseToAnyNumber() {
        int actualResponse = power.pow(100, 0);

        assertEquals(1, actualResponse);
    }

    @Test
    public void shouldReturnTheNumberItselfIfPowerRaisedIsOne() {
        int actualResponse = power.pow(100, 1);

        assertEquals(100, actualResponse);
    }

    @Test
    public void shouldComputePowerUsingDivideAndRuleIfPowerIsOdd() {
        int actualResponse = power.computePowerUsingDivideAndRule(2, 5);

        assertEquals(32, actualResponse);
    }

    @Test
    public void shouldComputePowerUsingDivideAndRuleIfPowerIsEven() {
        int actualResponse = power.computePowerUsingDivideAndRule(2, 6);

        assertEquals(64, actualResponse);
    }

    @Test
    public void shouldComputePowerUsingDivideAndRuleIfPowerIsOne() {
        int actualResponse = power.computePowerUsingDivideAndRule(100, 1);

        assertEquals(100, actualResponse);
    }
}