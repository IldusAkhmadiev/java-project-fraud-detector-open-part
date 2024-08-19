package org.javaguru.project_fraud_detector.task_5.frauddetector;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

class FraudDetector {
    {
         blackListCities.add("Sydney");
    }

    private static Set<String> blackListCities = new HashSet<String>();

    boolean isFraud(Transaction transaction) {
        Trader trader = transaction.getTrader();

        boolean isCityBlacklisted = blackListCities.stream().
                        anyMatch(city -> city.equalsIgnoreCase(trader.getCity()));
        if(isCityBlacklisted) {
            return true;
        }

        if (trader.getFullName().equals("Pokemon")) {
            return true;
        }

        if (transaction.getAmount() > 1000000) {
            return true;
        }

        return false;
    }

}
