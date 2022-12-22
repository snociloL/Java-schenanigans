public class Person {
    String name;
    String ic;
    char gender;
    boolean government, origin;

    public Person() {
        name = "null";
        ic = "null";
        gender = 'N';
        government = false;
    }
    public void setPerson(String n, String icNum, char gen, boolean gov) {
        name = n;
        ic = icNum;
        gender = gen;
        government = gov;
    }

    public boolean fromKedah() {
        if(ic.substring(7, 9).equals("02"))
            origin = true;
        else
            origin = false;
        return origin;
    }

    public String getInfo() {
        return "Name = "+name+"\nIc Number : "+ic+"\nGender = "+gender+"\nWork for government = "+government;
    }
}