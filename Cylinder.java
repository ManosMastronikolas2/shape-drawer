package shape;

import java.lang.Math;

public class Cylinder extends SolidShape{
    private double radius;
    private double height;
    //new methods
    public Cylinder(double x, double y, double z, double radius, double height) {
        super(x,y,z);
        this.setRadius(radius);
        this.setHeight(height);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }

    //overrides from SolidShape

    @Override
    public String toString() {
        return "Cylinder "+super.toString()+"Radius: "+this.getRadius()+"\nHeight: "+this.getHeight()+"\n";
    }
    @Override
    public int getNumberOfFaces() {
        return 3; //cylinder has 3 faces
    }
    //cylinder has no vertices, no need to override, SolidShape.getNumberOfEdges() will return 0;
    @Override
    public int getNumberOfEdges() {
        return 2; //cylinder has 2 edges
    }
    @Override
    public double getVolume() {
        return Math.PI* Math.pow(this.getRadius(), 2) *this.getHeight(); //π(r^2)h
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10,10,10,10,10);
        System.out.println(cylinder);
    }

}
