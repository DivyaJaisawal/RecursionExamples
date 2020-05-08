package com.divya.recursion;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolynomialsTest {
    private Polynomials polynomials;

    @Before
    public void setUp() throws Exception {
        polynomials = new Polynomials();
    }

    @Test
    public void shouldEvaluateAGivenPolynomials() {
        double[] coefficients = new double[]{5, 2};
        double actualResponse = polynomials.polynomial(coefficients, 2, 1);

        assertEquals(9, actualResponse, 0);
    }

    @Test
    public void shouldEvaluateAGivenPolynomialsForDegreeThree() {
        double[] coefficients = new double[]{5, 2, 3, 2};
        double actualResponse = polynomials.polynomial(coefficients, 2, 3);

        assertEquals(37, actualResponse, 0);
    }

    @Test
    public void shouldEvaluateAGivenPolynomialsUsingRecursion() {
        double[] coefficients = new double[]{5, 2};
        double actualResponse = polynomials.polynomialUsingRecursion(coefficients, 2, 1);

        assertEquals(9.0, actualResponse, 0);
    }

    @Test
    public void shouldEvaluateAGivenPolynomialsForDegreeThreeUsingRecursion() {
        double[] coefficients = new double[]{5, 2, 3, 2};
        double actualResponse = polynomials.polynomialUsingRecursion(coefficients, 2, 3);

        assertEquals(37, actualResponse, 0);
    }
}