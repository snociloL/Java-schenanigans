
public class TestCircle {
    public static void main(String[] args) {

        //call default constructor
        Circle c1 = new Circle();
        System.out.println("The new area of the circle 1 with radius "+c1.radius+" is "+c1.findArea());

        //call normal constructor
        Circle c2 = new Circle(5.0);
        System.out.println("The area of the circle 2 with radius "+c2.radius+" is "+c2.findArea());

        //call copy constructor 
        Circle c3 = new Circle(c2);
        System.out.println("The new area  of the circle 3 with radius "+c3.radius+" is "+c3.findArea());
        
    }
}