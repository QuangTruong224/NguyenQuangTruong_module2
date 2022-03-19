package case_study.models;

public class Booking {
    private int codeBooking;
    private String endOfDate;
    private String customerId;
    private String nameOfService;
    private String typeOfService;

    public Booking(int codeBooking,
                   String endOfDate,
                   String customerId,
                   String nameOfService,
                   String typeOfService) {
        this.codeBooking = codeBooking;
        this.endOfDate = endOfDate;
        this.customerId = customerId;
        this.nameOfService = nameOfService;
        this.typeOfService = typeOfService;
    }

    public Booking() {
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public String getEndOfDate() {
        return endOfDate;
    }

    public void setEndOfDate(String endOfDate) {
        this.endOfDate = endOfDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getNameOfService() {
        return nameOfService;
    }

    public void setNameOfService(String nameOfService) {
        this.nameOfService = nameOfService;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codeBooking=" + codeBooking +
                ", endOfDate='" + endOfDate + '\'' +
                ", customerId='" + customerId + '\'' +
                ", nameOfService='" + nameOfService + '\'' +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
