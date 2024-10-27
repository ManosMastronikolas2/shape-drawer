package shape;

import javax.sound.sampled.Line;
import java.io.*;

public class Drawing {
    SolidShape[] shapes = new SolidShape[1000];
    int activeCapacity=0;

    public void add(SolidShape shape) {
        if(activeCapacity<1000){
            shapes[activeCapacity] = shape;
            activeCapacity++;
            System.out.println("Shape added successfully!");
            return;
        }
        System.out.println("Could not add shape. No more space!");
    }

    public String toString(){
        int nF=0, nV=0,nE=0; //total faces, vertices, edges, volume
        double nVol=0;
        String msg = "";
        for(int i=0;i<activeCapacity;i++){
            nF += shapes[i].getNumberOfFaces();
            nV += shapes[i].getNumberOfVertices();
            nE += shapes[i].getNumberOfEdges();
            nVol += shapes[i].getVolume();
        }

        msg = msg.concat("Number of shapes: "+activeCapacity+"\n");
        msg = msg.concat("Number of faces: "+nF+"\n");
        msg = msg.concat("Number of vertices: "+nV+"\n");
        msg = msg.concat("Number of edges: "+nE+"\n");
        msg = msg.concat("Total Volume: "+nVol+"\n");
        return msg;
    }


    public String toJSON() throws FileNotFoundException {
        PrintWriter out = new PrintWriter("shapes.json");
        String json = "";
        json = json.concat("{\n");
        json = json.concat("\"drawing\":  [\n");
        for(int i=0;i<activeCapacity;i++){
            json = json.concat("       {\n");
            json = json.concat("             \"x\":" + shapes[i].getX() + ",\n");
            json = json.concat("             \"y\":" + shapes[i].getY() + ",\n");
            json = json.concat("             \"type\":" + '"'+shapes[i].getClass().getSimpleName().toLowerCase() +'"'+ ",\n");
            if( shapes[i] instanceof Sphere) {
                json = json.concat("             \"radius\":" + ((Sphere) shapes[i]).getRadius() + "\n");
            }
            else if(shapes[i] instanceof Cube) {
                json = json.concat("             \"side\":" + ((Cube) shapes[i]).getSide() + "\n");
            }
            else if(shapes[i] instanceof Cylinder) {
                json = json.concat("             \"radius\":" + ((Cylinder) shapes[i]).getRadius() + ",\n");
                json = json.concat("             \"height\":" + ((Cylinder) shapes[i]).getHeight() + "\n");
            }



            json = json.concat((i==activeCapacity-1)?("        }\n"):("        },\n")); //last element needs to end with }, not },
        }
        json = json.concat("]\n}");
        out.write(json);
        out.close();
        return json;
    }


}
