package org.javaguru.project_fraud_detector.task_3.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FraudDetectorTest {

    // так как метод isFraud не статический
    FraudDetector fraudDetector = new FraudDetector();

    @Test
    void isFraud() {
        Trader trader = new Trader("Pokemon", "Moscow");
        Trader trader2 = new Trader("pokemon", "Moscow");
        Trader trader3 = new Trader("PokemoN", "Moscow");
        Transaction transaction = new Transaction(trader, 5000);
        Transaction transaction2 = new Transaction(trader2, 50000);
        Transaction transaction3 = new Transaction(trader3, 500000);
        assertTrue(fraudDetector.isFraud(transaction));
        assertTrue(fraudDetector.isFraud(transaction2));
        assertTrue(fraudDetector.isFraud(transaction3));
    }

    @Test
    void isNotFraud() {
        Trader trader = new Trader("Pikachu", "Moscow");
        Trader trader2 = new Trader("PikachU", "Moscow");
        Trader trader3 = new Trader("PikAchU", "Moscow");
        Transaction transaction = new Transaction(trader, 5000);
        Transaction transaction2 = new Transaction(trader2, 50000);
        Transaction transaction3 = new Transaction(trader3, 500000);
        assertFalse(fraudDetector.isFraud(transaction));
        assertFalse(fraudDetector.isFraud(transaction2));
        assertFalse(fraudDetector.isFraud(transaction3));
    }
}