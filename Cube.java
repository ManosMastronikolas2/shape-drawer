package shape-drawer;

import java.lang.Math;

public class Cube extends SolidShape {
    double side;
    //new methods
    public Cube(double x, double y, double z, double side) {
        super(x, y, z);
        this.setSide(side);
    }
    public void setSide(double side) {
        this.side = side;
    }
    public double getSide() {
        return side;
    }
    //overrides from SolidShape
    @Override
    public String toString() {
        return "Cube "+super.toString()+"Side: "+this.getSide()+"\n";
    }
    @Override
    public int getNumberOfFaces() {
        return 6; //cubes have 6 faces
    }
    @Override
    public int getNumberOfEdges() {
        return 12; //cube has 12 edges
    }
    @Override
    public int getNumberOfVertices() {
        return 8; //cube has 8 vertices
    }
    @Override
    public double getVolume() {
        return Math.pow(this.getSide(),3); //side^3
    }

}
