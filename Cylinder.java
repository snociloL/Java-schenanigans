public class Cylinder {
    private double radius;
    private double height;

    
    public Cylinder() // default constructor
    {
        radius = 1.0;
        height = 2.0;
    }

    public Cylinder(double r, double h) // normal constructor
    {
        radius = r;
        height = h;
    }

    public Cylinder(Cylinder c) // copy constructor
    {
        radius = c.radius;
        height = c.height;
    }
        //accessors
        public double getRadius() {return radius;}
        public double getHeight() {return height;}
        //mutators
        public void setHeight(double tinggi) {height = tinggi;}
        public void setRadius(double jejari) {radius = jejari;}

    public double calcVolume()
    {
       return radius*radius*3.14159*height;
    }
    
    public static void main(String[] args) {
        
        Cylinder a = new Cylinder(3.0, 8.0);
        System.out.println("The radius of a cylinder is 3.0cm and the height is 8.0cm.\nWith the information given, the volume of the cylinder is "+a.calcVolume()+"cm^2.");
    }

}
