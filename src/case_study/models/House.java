package case_study.models;

public class House extends Facility {
    private String standardRoom;
    private int floor;



    public House(String idService,
                 String nameService,
                 double areaUse,
                 int price,
                 int rentalPeopleMax,
                 String styleRental,
                 String standardRoom,
                 int floor) {
        super(idService, nameService, areaUse, price, rentalPeopleMax, styleRental);
        this.standardRoom = standardRoom;
        this.floor = floor;
    }

    public House() {
    }

    public House(String tieuChuanPhong, int sotang) {
        this.standardRoom = tieuChuanPhong;
        this.floor = sotang;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "StandardRoom='" + standardRoom + '\'' +
                ", Floor=" + floor;
    }
}
