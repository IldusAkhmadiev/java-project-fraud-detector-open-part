package org.javaguru.project_fraud_detector.task_9.frauddetector;

public class AmountRule implements FraudRule{
    @Override
    public  boolean isFraud(Transaction transaction) {
        if (transaction.getAmount() > 1000000) {
            return true;
        }
        return false;
    }
}
