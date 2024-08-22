package org.javaguru.project_fraud_detector.task_9.frauddetector;

import java.util.ArrayList;
import java.util.Arrays;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();
        NameRule nameRule = new NameRule();
        boolean fraud = nameRule.isFraud(transaction);
        AmountRule amountRule = new AmountRule();
        boolean fraud1 = amountRule.isFraud(transaction);
        CityRule cityRule = new CityRule();
        boolean fraud2 = cityRule.isFraud(transaction);
        CountryRule countryRule = new CountryRule();
        boolean fraud3 = countryRule.isFraud(transaction);
        CountryAndAmountRule countryAndAmountRule = new CountryAndAmountRule();
        boolean fraud4 = countryAndAmountRule.isFraud(transaction);
        Boolean[] fraunds = {fraud1,fraud2,fraud3,fraud4};
        boolean b = Arrays.asList(fraunds).stream().anyMatch(aBoolean -> aBoolean);
        return b ? true : false;

    }

}
