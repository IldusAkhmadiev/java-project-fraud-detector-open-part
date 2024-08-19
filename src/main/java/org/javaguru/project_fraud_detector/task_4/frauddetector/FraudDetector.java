package org.javaguru.project_fraud_detector.task_4.frauddetector;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        if(transaction.getAmount() > 1000000) {
            return true;
        }
        Trader trader = transaction.getTrader();
        if (trader.getFullName().equalsIgnoreCase("Pokemon")) {
            return true;
        } else {
            return false;
        }
    }

}
