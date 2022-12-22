public class TestCylinder {
    public static void main(String[] args) {
        
        Cylinder a = new Cylinder(3.0, 8.0);
        System.out.println("The radius of a cylinder is 3.0cm and the height is 8.0cm.\nWith the information given, the volume of the cylinder is "+a.calcVolume()+"cm^2.");
    }
}
