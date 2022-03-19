package case_study.models;

public class Villa extends Facility{
    private String standardVilla;
    private double areaPool;
    private int floor;

    public Villa(String idService,
                 String nameService,
                 double areaUse,
                 int price,
                 int rentalPeopleMax,
                 String styleRental,
                 String standardVilla,
                 double areaPool,
                 int floor) {
        super(idService, nameService, areaUse, price, rentalPeopleMax, styleRental);
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String standardVilla, double areaPool, int floor) {
        this.standardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa() {
    }

    public String getStandardVilla() {
        return standardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        this.standardVilla = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString()+
                "standardVilla='" + standardVilla + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor ;
    }
}
