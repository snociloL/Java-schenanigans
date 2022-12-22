public class Enrollment {
    private String code;
    private int yr2021, yr2022, yr2023;

    public Enrollment(String c, int y21, int y22, int y23){
        code =c;
        yr2021=y21;
        yr2022=y22;
        yr2023=y23;
    }

    public String getCode() {return code;}
    public int getYr21() {return yr2021;}
    public int getYr22() {return yr2022;}
    public int getYr23() {return yr2023;}
}
