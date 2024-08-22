package org.javaguru.project_fraud_detector.task_9.frauddetector;

public class CityRule implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCity().equals("Sydney")) {
            return true;
        }
        return false;
    }
}
