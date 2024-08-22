package org.javaguru.project_fraud_detector.task_9.frauddetector;

public class NameRule implements FraudRule {
    @Override
    public boolean isFraud(Transaction transaction) {

        if (transaction.getTrader().getFullName().equals("Pokemon")) {
            return true;
        }
        return false;
    }
}
