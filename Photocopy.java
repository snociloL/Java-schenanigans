public class Photocopy {
    String lectName;
    String staffID;
    String facCode;
    String assType;
    int masterNum;
    int copiesNum;

    public Photocopy() {
        lectName = "null"; staffID = "null"; facCode = "null"; assType = "null"; masterNum = 0; copiesNum = 0;
    }

    public void setPhotocopy(String l, String s, String f, String a, int m, int c) {lectName = l; staffID = s; facCode = f; assType = a; masterNum = m; copiesNum = c;}

    public String getLectName() {return lectName;}
    public String getStaffID() {return staffID;}
    public String getFacCode() {return facCode;}
    public String getAssType() {return assType;}
    public int getMasterNum() {return masterNum;}
    public int getCopiesNum() {return copiesNum;}

    public String toString() {
        return "\nStaff ID:"+staffID+" Number of pages for master copy : "+masterNum+" Number of copies required : "+copiesNum+"Total : "+masterNum*copiesNum;
    }
}
