public class Furniture {

    String furnitureType;
    String material;
    double pricePerUnit;
    int quantity;

    public Furniture(){
        furnitureType = "null";
        material = "null";
        pricePerUnit = 0;
        quantity = 0;
    }
    public Furniture(String f, String m,double p, int q) // normal constructor
    {
        furnitureType = f;
        material = m;
        pricePerUnit = p;
        quantity = q;
    }

    public String getMaterial() {return material;}
    public String getFurnitureType() {return furnitureType;}
    public double getPricePerunit() {return pricePerUnit;}
    public int getQuantity() {return quantity;}

    public void setMaterial(String mat) {material = mat;}
    public void setFurnitureType(String fT) {furnitureType = fT;}
    public void setPricePerUnit(double ppU) {pricePerUnit = ppU;}
    public void setQuantity(int quan) {quantity = quan;}

    public double calcPriceFurniture() {
        double discount;

        switch(material)
        {
            case "Wood": discount = (1-0.2);
            break;
            case "wood": discount = (1-0.2);
            break;
            case "Rattan": discount = (1-0.15);
            break;
            case "rattan": discount = (1-0.15);
            break;
            case "Metal": discount = (1-0.10);
            break;
            case "metal": discount = (1-0.10);
            break;
            case "Bamboo": discount = (1-0.05);
            break;
            case "bamboo": discount = (1-0.05);
            break;
            default: discount = 0.0;
            break;
        }
        return pricePerUnit*quantity*discount;
    }

    public void afterMath() {
        System.out.println(material+" "+furnitureType+", The price is RM"+calcPriceFurniture());
    }


    public static void main(String[] args) {
        Furniture[] arrFurniture = new Furniture[4];
        String[] material = {"Wood","Rattan","Metal","Bamboo"};
        double highestPrice=0;
        Furniture highestPriceMaterial = new Furniture();

            for(int i=0;i<arrFurniture.length; i++) {
                arrFurniture[i] = new Furniture("Chair", material[i], 100, 1);
                System.out.println("\nFor the furniture :-");
                arrFurniture[i].afterMath();
                if(arrFurniture[i].calcPriceFurniture()>highestPrice){
                    highestPrice = arrFurniture[i].calcPriceFurniture();
                    highestPriceMaterial = arrFurniture[i];
                }
            }
            System.out.println("\n\nThe most expensive furniture is :-");
            highestPriceMaterial.afterMath();
    }
}