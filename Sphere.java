package shape-drawer;

import java.lang.Math;

public class Sphere extends SolidShape {
    private double radius;
    //new methods
    public Sphere(double x, double y, double z, double radius) {
        super(x, y, z);
        this.setRadius(radius);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    //overrides from SolidShape
    @Override
    public String toString(){
        return "Sphere "+super.toString()+"Radius: "+this.getRadius()+"\n";
    }
    @Override
    public int getNumberOfFaces(){
        return 1;
    }
    @Override
    public double getVolume(){
        return (4.0/3.0)*Math.PI*(Math.pow(this.getRadius(),3)); //(4/3)π(r^3)
    }


}
