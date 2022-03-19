package case_study.models;

public class Room extends Facility{
    private String servicePlus;

    public Room(String idService,
                String nameService,
                double areaUse,
                int price,
                int rentalPeopleMax,
                String styleRental,
                String servicePlus) {
        super(idService, nameService, areaUse, price, rentalPeopleMax, styleRental);
        this.servicePlus = servicePlus;
    }

    public Room(String servicePlus) {
        this.servicePlus = servicePlus;
    }

    public Room() {
    }

    public String getServicePlus() {
        return servicePlus;
    }

    public void setServicePlus(String servicePlus) {
        this.servicePlus = servicePlus;
    }

    @Override
    public String toString() {
        return super.toString() +
                "servicePlus='" + servicePlus + '\'' ;
    }

}
