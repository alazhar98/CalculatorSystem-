package Calculators;

import Data.CircleData;

public class AreaOfCircleCalculator implements Calculator{

    private CircleData circleData;

    public AreaOfCircleCalculator(CircleData circleData){
        this.circleData=circleData;
    }

    @Override
    public void calculator() {
        double r = circleData.getRadius();
        double area = Math.PI * r * r;
        System.out.println("Area of Circle (A) = " + area);
    }
}
