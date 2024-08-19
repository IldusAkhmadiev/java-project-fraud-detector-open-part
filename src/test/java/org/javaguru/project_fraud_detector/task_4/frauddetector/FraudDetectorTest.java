package org.javaguru.project_fraud_detector.task_4.frauddetector;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudDetectorTest {

    private FraudDetector fraudDetector = new FraudDetector();

    @Test
    public void shouldBeFraudTransactionFromTraderPokemon() {
        Trader trader = new Trader("Pokemon", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertTrue(fraudDetector.isFraud(transaction));
    }

    @Test
    public void shouldNotBeFraudTransactionFromOtherTraderThenPokemon() {
        Trader trader = new Trader("Jon", "Rome");
        Transaction transaction = new Transaction(trader, 1000);
        assertFalse(fraudDetector.isFraud(transaction));
    }
    @Test
    public void isFraudAmountMoreThen1m() {
        Trader trader = new Trader("Pokemon", "Moscow");
        Trader trader3 = new Trader("Maks", "Moscow");
        Transaction transaction = new Transaction(trader, 5000);
        Transaction transaction3 = new Transaction(trader3, 5_000_000);
        assertTrue(fraudDetector.isFraud(transaction));
        assertTrue(fraudDetector.isFraud(transaction3));
    }

    @Test
    public void isNotFraudAmountLessThen1m() {
        Trader trader = new Trader("Rerix", "Moscow");
        Trader trader2 = new Trader("Krio", "Moscow");
        Transaction transaction = new Transaction(trader, 5000);
        Transaction transaction2 = new Transaction(trader2, 999_999);
        assertFalse(fraudDetector.isFraud(transaction));
        assertFalse(fraudDetector.isFraud(transaction2));
    }
}