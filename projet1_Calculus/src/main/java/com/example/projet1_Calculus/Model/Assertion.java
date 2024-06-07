package com.example.projet1_Calculus.Model;

public class Assertion {
    private String statement1;
    private String statement2;
    private String operator;

    public Assertion(String statement1, String statement2, String operator) {
        this.statement1 = statement1;
        this.statement2 = statement2;
        this.operator = operator;
    }

    public String getStatement1() {
        return statement1;
    }

    public void setStatement1(String statement1) {
        this.statement1 = statement1;
    }

    public String getStatement2() {
        return statement2;
    }

    public void setStatement2(String statement2) {
        this.statement2 = statement2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
