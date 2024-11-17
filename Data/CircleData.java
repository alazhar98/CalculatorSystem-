package Data;

public class CircleData {
    private double radius;
    private BaseData baseData;

    public CircleData (double radius , String description){
        this.radius=radius;
        this.baseData = new BaseData(description);
    }

    public double getRadius() {
        return radius;
    }

    public BaseData getBaseData() {
        return baseData;
    }

}
