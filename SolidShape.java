package shape;

public class SolidShape {
    private double x,y,z, volume;
    public SolidShape(){};
    public SolidShape(double x, double y, double z) {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    //setters
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }

    //getters
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getZ() {
        return this.z;
    }
    public int getNumberOfFaces() {
        return 0;
    }
    public int getNumberOfVertices() {
        return 0;
    }
    public int getNumberOfEdges() {
        return 0;
    }
    public double getVolume() {
        return 0.0;
    }

    //other methods
    public String toString() {
        String msg="";
        msg = msg.concat("Solid Shape centered at ("+this.getX()+","+this.getY()+","+this.getZ()+") with\n");
        msg = msg.concat("Faces: "+this.getNumberOfFaces()+"\n");
        msg = msg.concat("Vertices: "+this.getNumberOfVertices()+"\n");
        msg = msg.concat("Edges: "+this.getNumberOfEdges()+"\n");
        msg = msg.concat("Volume: "+this.getVolume()+"\n");

        return msg;
    }


    
}
