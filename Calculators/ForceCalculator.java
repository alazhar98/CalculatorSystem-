package Calculators;

import Data.PhysicsData;

public class ForceCalculator implements Calculator {
    private PhysicsData physicsData;

    public ForceCalculator(PhysicsData physicsData){
        this.physicsData=physicsData;

    }

    @Override
    public void calculator() {
        double m = physicsData.getMass();
        double a = physicsData.getMotionData().getAcceleration();
        double F = m * a;
        System.out.println("Force (F) = " + F);
    }
}
