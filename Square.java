public class Square {
    
        double height;
        double width; //data member as default modifier
        double surfaceArea;

    public Square() // default constructor
    {
        height = 1.0;
        width = 1.0;
    }

    public Square(double r, double w) // normal constructor
    {
        height = r;
        width = w;
    }

    public Square(Square c) // copy constructor
    {
        height = c.height;
        width = c.width;
    }

    public double computeSurfaceArea()
    {
        return width*height;
    }
}