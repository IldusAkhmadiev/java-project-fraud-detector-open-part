package org.javaguru.project_fraud_detector.task_9.frauddetector;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FraudChecker {
    /** Любой метод который возвращает true означает что сделка мошенническая
     *
     */

    private Transaction transaction;
    private Trader trader;
    private static List<String> bannedNames = new ArrayList<String>();
    public final static int MAX_SUM;
    private static List<String> bannedCities = new ArrayList<>();
    private static List<String> bannedCountries = new ArrayList<>();
    private static HashMap<String,Integer> maxForCountry = new HashMap<>();

    static {
        /**
         * Загрузка данных из базы данных
         */
        bannedNames.add("Pokemon");
        MAX_SUM = 1_000_000;
        bannedCities.add("Sydney");
        bannedCountries.add("Jamaica");
        maxForCountry.put("Germany", 1000);
    }

    public FraudChecker(Transaction transaction) {
        this.transaction = transaction;
        this.trader = transaction.getTrader();
    }

    public boolean nameBanned(Trader trader) {
        return bannedNames.contains(trader.getFullName());
    }
    public boolean amountNotAllowed(Transaction transaction) {
        return transaction.getAmount() > MAX_SUM;
    }
    public boolean citiesBanned(Trader trader) {
        return bannedCities.contains(trader.getCity());
    }
    public boolean countriesBanned(Trader trader) {
        return bannedCountries.contains(trader.getCountry());
    }
    public boolean overLimitCountry(Trader trader,Integer limit) {
        return maxForCountry.get(trader.getCountry()) > limit;
    }

}
