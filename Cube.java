public class Cube extends Square{
    double depth;

    public Cube(){
        super();
        depth = 1.0;
    }

    public Cube(double d) {
        depth = d;
    }

    public double computeSurfaceArea() {
        return width*height*depth;

    }

}
