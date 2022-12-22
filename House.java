public class House {
    char houseType;
    double price;
    double area;
    Person owner;

    public House() {
        houseType = 'A';
        price = 0.0;
        area = 0.0;
    }
    public void setHouse(char house, double sizeArea) {
        houseType = house;
        area = sizeArea;
    }

    public double calculateTax() {

        switch(houseType) {
            case 'T':
            {
                price=area/10.00;
            }
            case 'S':
            {
                price= area/15.00;
            }
            case 'B':
            {
                price=area/20.00;
            }
            case 'C':
            {
                price=area/30.00;
            }
            default: System.out.println("");
            
        }
        return price;
    }
    public String toString() {
        return "\n\nHouse Type : "+houseType+"\nTax Price : RM"+calculateTax()+"\nHouse Area : "+area+"m*m\n\nOwner : ";
    }
}