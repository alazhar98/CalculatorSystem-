package Data;

public class InterestData {
    private double principal;
    private double rate;
    private double time;
    private PhysicsData physicsData;

    public InterestData(double principal, double rate , double time , PhysicsData physicsData){
         this.principal=principal;
         this.rate=rate;
         this.physicsData=physicsData;
         this.time=time;
    }
    public double getPrincipal() {
        return principal;
    }

    public double getRate() {
        return rate;
    }

    public double getTime() {
        return time;
    }

    public PhysicsData getPhysicsData() {
        return physicsData;
    }

}
