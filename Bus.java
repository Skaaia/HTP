package lesson3;

public class Bus implements Comparable<Bus> {
    private final String carBrand;
    private int startExp;
    private String driverSurname;
    private int number;
    private int routeNumber;
    private int dist;

    public Bus(int startExp, String driverSurname, int number, int routeNumber, int dist,String carBrand)
    {
        this.startExp = startExp;
        this.driverSurname = driverSurname;
        this.number = number;
        this.routeNumber = routeNumber;
        this.dist = dist;
        this.carBrand = carBrand;
    }

    public Bus(String carBrand, int startExp, String driverSurname, int number, int routeNumber) {
        this.carBrand = carBrand;
        this.startExp = startExp;
        this.driverSurname = driverSurname;
        this.number = number;
        this.routeNumber = routeNumber;
    }

    public Bus(String carBrand, int startExp, String driverSurname, int number) {
        this.carBrand = carBrand;
        this.startExp = startExp;
        this.driverSurname = driverSurname;
        this.number = number;
    }

    public Bus(String carBrand, int startExp, String driverSurname) {
        this.carBrand = carBrand;
        this.startExp = startExp;
        this.driverSurname = driverSurname;
    }

    public Bus(String carBrand, int startExp) {
        this.carBrand = carBrand;
        this.startExp = startExp;
    }

    public Bus(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarBrand() {
        return carBrand;
    }


    public int getstartExp() {
        return startExp;
    }

    public void setstartExp(int startExp) {
        this.startExp = startExp;
    }

    public String getdriverSurname() {
        return driverSurname;
    }

    public void setdriverSurname(String driverSurname) {
        this.driverSurname = driverSurname;
    }

    public int getnumber() {
        return number;
    }

    public void setnumber(int number) {
        this.number = number;
    }

    public int getrouteNumber() {
        return routeNumber;
    }

    public void setrouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }

    public int getdist() {
        return dist;
    }

    public void setdist(int dist) {
        this.dist = dist;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "carBrand='" + carBrand + '\'' +
                ", startExp=" + startExp +
                ", driverSurname='" + driverSurname + '\'' +
                ", number=" + number +
                ", routeNumber=" + routeNumber +
                ", dist=" + dist +
                '}';
    }
    @Override
    public int compareTo(Bus o)
    {
        return o.distC()-this.distC();
    }
    public int distC(){
        int distR = dist;
        return distR;
    }

}
