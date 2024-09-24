abstract class Shape3D {
    abstract void calculateVolume();
    abstract void calculateSurfaceArea();
}

class Sphere extends Shape3D {
    double r;
	public Sphere(double r) {
        this.r = r;
    }
    public void calculateVolume() {
        System.out.println("Sphere Volume: " +((4.0/3.0)*3.14*r*r*r));
    }
    public void calculateSurfaceArea() {
        System.out.println("Sphere Surface Area: " + (4*3.14*r*r));
    }
}
class Cube extends Shape3D {
    double s;
	public Cube(double s) {
        this.s = s;
    }
    public void calculateVolume() {
        System.out.println("Cube Volume: " + (s*s*s));
    }
    public void calculateSurfaceArea() {
        System.out.println("Cube Surface Area: " + (6*s*s));
    }
}
public class Shape {
    public static void main(String[] args) {
        Shape3D sphere = new Sphere(5);
		sphere.calculateVolume();
		sphere.calculateSurfaceArea();
		Shape3D cube = new Cube(4);
		cube.calculateVolume();
		cube.calculateSurfaceArea();
    }
}
