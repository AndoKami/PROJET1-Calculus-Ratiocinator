package com.example.projet1_Calculus;

import com.example.projet1_Calculus.Model.Assertion;
import com.example.projet1_Calculus.Service.Logique;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogicEvaluatorTest {

    private final Logique logique = new Logique();

    @Test
    public void testLouEstPauvreEtLouEstGenereux() {
        Assertion assertion = new Assertion("Lou est pauvre", "Lou est généreux", "et");
        boolean result = logique.evaluateAssertion(assertion);
        assertEquals(false, result);
    }

    @Test
    public void testLouEstBeauDoncLouEstPauvre() {
        Assertion assertion = new Assertion("Lou est beau", "Lou est pauvre", "donc");
        boolean result = logique.evaluateAssertion(assertion);
        assertEquals(false, result);
    }

    @Test
    public void testLouEstPauvreDoncLouEstGenereux() {
        Assertion assertion = new Assertion("Lou est pauvre", "Lou est généreux", "donc");
        boolean result = logique.evaluateAssertion(assertion);
        assertEquals(true, result);
    }

    @Test
    public void testLouEstBeauOuLouEstGenereuxDoncLouEstPauvre() {
        Assertion assertion = new Assertion("Lou est beau ou Lou est généreux", "Lou est pauvre", "donc");
        boolean result = logique.evaluateAssertion(assertion);
        assertEquals(false, result);
    }

    @Test
    public void testComplexAssertion() {
        Assertion assertion = new Assertion("Lou est beau ou Lou est généreux. Donc Lou est pauvre.",
                "Lou est pauvre ou Lou est généreux.",
                "complex");
        boolean result = logique.evaluateAssertion(assertion);
        assertEquals(false, result);
    }
}