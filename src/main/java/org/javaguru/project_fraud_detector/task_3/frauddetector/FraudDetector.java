package org.javaguru.project_fraud_detector.task_3.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if (transaction.getTrader().getFullName().equalsIgnoreCase("Pokemon")) {
            return true;
        }
        return false;

    }
}
