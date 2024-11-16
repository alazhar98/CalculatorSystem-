package Entities;

public class MotionData {
    private double initialVelocity;
    private double acceleration;
    private double time;
    private BaseData baseData;

    public MotionData(double initialVelocity, double acceleration, double time, String description) {
        this.initialVelocity = initialVelocity;
        this.acceleration = acceleration;
        this.time = time;
        this.baseData = new BaseData(description);
    }
    public double getInitialVelocity() {
        return initialVelocity;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public double getTime() {
        return time;
    }

    public BaseData getBaseData() {
        return baseData;
    }

}
