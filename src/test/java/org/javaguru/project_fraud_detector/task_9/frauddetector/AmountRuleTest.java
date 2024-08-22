package org.javaguru.project_fraud_detector.task_9.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AmountRuleTest {

    @Test
    void isFraud() {
        Trader trader = new Trader("Zorro","Sindey","Astralia");
        AmountRule amountRule = new AmountRule();
        assertTrue(amountRule.isFraud(new Transaction(trader,1_000_001)));

    }
    @Test
    void isNotFraud() {
        Trader trader = new Trader("Zorro","Sindey","Astralia");
        AmountRule amountRule = new AmountRule();
        assertTrue(amountRule.isFraud(new Transaction(trader,999_999)));

    }
}