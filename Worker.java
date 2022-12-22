public class Worker {

    private String name;
    private String icNumber;
    private String unit;

    public Worker() { //default constructor
        name = "null";
        icNumber = "null null";
        unit = "null null null";
    }

    public void setWorker(String n, String ic, String d){ //setter
        name = n;
        icNumber = ic;
        unit = d;
    }
    
    public String getName() { return name; }
    public String getIcNumber() { return icNumber; }
    public String getUnit() { return unit; }

    public boolean fromKelantan() {
        if(icNumber.substring(7, 9).equals("03"))
            return true;
        else
            return false;
    }

    public String displayInfo() {

        return "\nName : "+getName()+"\nIC Number : "+getIcNumber()+"\nWork Unit : "+getUnit();
    }
}