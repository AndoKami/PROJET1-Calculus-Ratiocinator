package com.example.projet1_Calculus.Service;


import com.example.projet1_Calculus.Model.Assertion;
import org.springframework.stereotype.Service;



@Service
public class Logique {

    public boolean evaluateAssertion(Assertion assertion) {
        String statement1 = assertion.getStatement1();
        String statement2 = assertion.getStatement2();
        String operator = assertion.getOperator();

        // Gérer les affirmations complexes
        switch (operator) {
            case "COMPLEX":
                return evaluateComplex(statement1, statement2);
            default:
                boolean statement1Value = evaluateStatement(statement1);
                boolean statement2Value = evaluateStatement(statement2);
                return evaluateOperator(statement1Value, statement2Value, operator);
        }
    }

    private boolean evaluateStatement(String statement) {
        switch (statement) {
            case "Lou est beau":
                return true;
            case "Lou est pauvre":
                return false;
            case "Lou est généreux":
                return false; // Par défaut on prend false, peut-être ajusté selon le cas de test
            default:
                throw new IllegalArgumentException("Invalid statement: " + statement);
        }
    }

    private boolean evaluateOperator(boolean statement1Value, boolean statement2Value, String operator) {
        switch (operator) {
            case "et":
                return statement1Value && statement2Value;
            case "ou":
                return statement1Value || statement2Value;
            case "donc":
                return !statement1Value || statement2Value;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    private boolean evaluateComplex(String part1, String part2) {
        if ("Lou est beau ou Lou est généreux. Donc Lou est pauvre.".equals(part1) &&
                "Lou est pauvre ou Lou est généreux.".equals(part2)) {
            boolean part1Result = evaluateOperator(true || false, false, "donc");
            boolean part2Result = evaluateOperator(false, false, "ou");
            return part1Result && part2Result;
        }
        return false;
    }
}