package shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Drawing drawing = new Drawing();
        String choice= "";
        while (choice.charAt(0) != 'q') {
            System.out.println("Choices are:");
            System.out.println("Sphere: s x,y,z,radius");
            System.out.println("Cube: C  x,y,z,side");
            System.out.println("Cylinder: c x,y,z,radius, height");
            System.out.println("Quit: q");
            choice = in.nextLine();

            switch (choice.charAt(0)) {
                case 'c':
                    Cylinder c = new Cylinder(choice.charAt(1)-'0',choice.charAt(2)-'0', choice.charAt(3)-'0',
                            choice.charAt(4)-'0', choice.charAt(5)-'0');
                    drawing.add(c);
                    break;
                case 's':
                    Sphere s = new Sphere(choice.charAt(1)-'0',choice.charAt(2)-'0', choice.charAt(3)-'0', choice.charAt(4)-'0');
                    drawing.add(s);
                    break;
                case 'C':
                    Cube C = new Cube(choice.charAt(1)-'0',choice.charAt(2)-'0', choice.charAt(3)-'0', choice.charAt(4)-'0');
                    drawing.add(C);
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        }
        try{
            drawing.toJSON();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
