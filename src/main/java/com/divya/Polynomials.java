package com.divya;

/**
 * p(n) = A0 + A1x + A2x^2 + A3x^3...ANx^n
 */
public class Polynomials {

    public double polynomial(double coefficients[], double x, int degree) {
        double sum = 0.0;
        for (int i = 0; i <= degree; i++) {
            sum += coefficients[i] * Math.pow(x, i);
        }
        return sum;
    }

    public double polynomialUsingRecursion(double coefficients[], double x, int degree) {
        if (degree == 0) return coefficients[0];
        return coefficients[degree] * Math.pow(x, degree) +
                polynomialUsingRecursion(coefficients, x, degree-1);
    }
}
