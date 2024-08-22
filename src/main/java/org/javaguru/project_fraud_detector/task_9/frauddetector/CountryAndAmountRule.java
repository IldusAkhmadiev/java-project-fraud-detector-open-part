package org.javaguru.project_fraud_detector.task_9.frauddetector;

public class CountryAndAmountRule implements FraudRule{
    @Override
    public boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getCountry().equals("Germany")
                && transaction.getAmount() > 1000) {
            return true;
        }
        return false;
    }
}
