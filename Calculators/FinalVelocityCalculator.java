package Calculators;

import Data.MotionData;

public class FinalVelocityCalculator implements Calculator {
    private MotionData motionData;

    public FinalVelocityCalculator (MotionData motionData){
        this.motionData=motionData;
    }
    @Override
    public void calculator() {
        double u = motionData.getInitialVelocity();
        double a = motionData.getAcceleration();
        double t = motionData.getTime();
        double v = u+a*t;
        System.out.println("Final Velocity (v)= "+v);
    }
}
