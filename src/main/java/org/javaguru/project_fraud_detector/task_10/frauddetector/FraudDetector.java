package org.javaguru.project_fraud_detector.task_10.frauddetector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FraudDetector {
    private FraudRule rule1 = new FraudRule1();
    private FraudRule rule2 = new FraudRule2();
    private FraudRule rule3 = new FraudRule3();
    private FraudRule rule4 = new FraudRule4();
    private FraudRule rule5 = new FraudRule5();

    private List<FraudRule> rules = new ArrayList<>();

    public FraudDetector(List<FraudRule> rules) {
        this.rules = rules;
    }

    public FraudDetector() {
    }


    boolean isFraud(Transaction transaction) {
       return new ArrayList<>(Arrays.asList(rule1,rule2,rule3,rule4,rule5)).stream()
               .anyMatch(fraudRule -> fraudRule.isFraud(transaction));
    }

    boolean isFraud(Transaction transaction,List<FraudRule> rules) {
        return rules.stream()
                .anyMatch(fraudRule -> fraudRule.isFraud(transaction));
    }
}
