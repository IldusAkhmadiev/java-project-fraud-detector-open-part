package org.javaguru.project_fraud_detector.task_9.frauddetector;

public class CountryRule implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCountry().equals("Jamaica")) {
            return true;
        }
        return false;
    }
}
