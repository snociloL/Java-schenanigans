public class Circle
{
        double radius; //data member as default modifier
    public Circle() // default constructor
    {
        radius = 1.0;
    }

    public Circle(double r) // normal constructor
    {
        radius = r;
    }

    public Circle(Circle c) // copy constructor
    {
        radius = c.radius;
    }

    public double findArea()
    {
        return radius*radius*3.14159;
    }
}