package Entities;

public class PhysicsData {
    private double mass;
    private MotionData motionData;

    public PhysicsData(double mass , MotionData motionData){
        this.mass=mass;
        this.motionData=motionData;
    }
    public double getMass() {
        return mass;
    }

    public MotionData getMotionData() {
        return motionData;
    }
}
