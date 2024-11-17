package Calculators;

import Data.InterestData;

public class SimpleInterestCalculator implements Calculator {

    private InterestData interestData;

    public SimpleInterestCalculator(InterestData interestData) {
        this.interestData = interestData;
    }

    @Override
    public void calculator() {
        double P = interestData.getPrincipal();
        double R = interestData.getRate();
        double T = interestData.getTime();
        double SI = P * R * T / 100;
        System.out.println("Simple Interest (SI) = " + SI);

    }
}
