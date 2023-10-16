// Create a Class as Cylinder and finds its Surface Area of CYlinder and volume (with the help of getters and setters )

class Cylinder {
    private int radius;
    private int height;

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    public void setHeight(int h) {
        height = h;
    }

    public int getHeight() {
        return height;

    }

    public double surfaceArea() {
        return 2 * 3.14 * radius * height + 2 * 3.14 * radius * radius;          // <-- here we can use Math.PI(instead of 3.14)to get accurate answers 
    }
    public double Volume(){
        return 3.142*radius*radius*height;
    }

}

public class Q {
    public static void main(String[] args) {
        Cylinder obj = new Cylinder();

        obj.setRadius(9);
        System.out.println(obj.getRadius());

        obj.setHeight(9);
        System.out.println(obj.getHeight());

        System.out.println("The Surface Area of Cylinder is : " + obj.surfaceArea());
        
        System.out.println("The Volume of the Cylinder is : "+obj.Volume());

    }
}

OUTPUT:
9
9
The Surface Area of Cylinder is : 1017.36
The Volume of the Cylinder is : 2290.518
