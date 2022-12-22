/*class Square 
{
    double height;
    double width;
    double surfaceArea;

    public Square(double h, double w, double s)
    {
        height = h;
        width = w;
        surfaceArea = s;
    }

    public double computeSurfaceAra(double h, double w)
    {
        surfaceArea = h * w;
        return surfaceArea;
    }
}

 class Cube extends Square
{
    double depth;


    public Cube(double h, double w, double s, double d)
    {
        super(h,w,s);
        depth = d;
    }

    public double computeSurfaceArea(double area, double d)
    {
        double cubeArea = surfaceArea * d;

        return cubeArea;
    }
}

public class calculateSurfaceArea 
{
    public static void main(String[] args) 
    {
        double squareArea = 0;
        Square sq = new Square(3,4,12);
        Cube c =  new Cube(3, 4, 12, 6);


        squareArea = sq.computeSurfaceAra(3, 4);
        System.out.println("Surface area of square is: " + squareArea);
        System.out.println("Surface area of square is: " + c.computeSurfaceAra(c.surfaceArea, 6));
    }
}
*/