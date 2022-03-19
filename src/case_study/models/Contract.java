package case_study.models;

public class Contract {
    private String codeofContract;
    private String codeBooking;
    private int depots; // tiền đặt cọc
    private int totalPayment; //tổng tiền phải thanh toán
    private String customerId;

    public Contract(String codeofContract,
                    String codeBooking,
                    int depots,
                    int totalPayment,
                    String customerId) {
        this.codeofContract = codeofContract;
        this.codeBooking = codeBooking;
        this.depots = depots;
        this.totalPayment = totalPayment;
        this.customerId = customerId;
    }

    public Contract() {
    }

    public String getCodeofContract() {
        return codeofContract;
    }

    public void setCodeofContract(String codeofContract) {
        this.codeofContract = codeofContract;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public int getDepots() {
        return depots;
    }

    public void setDepots(int depots) {
        this.depots = depots;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "codeofContract='" + codeofContract + '\'' +
                ", codeBooking='" + codeBooking + '\'' +
                ", depots=" + depots +
                ", totalPayment=" + totalPayment +
                ", customerId='" + customerId + '\'' +
                '}';
    }
}
