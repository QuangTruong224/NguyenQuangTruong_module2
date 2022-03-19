package case_study.models;

public class Customer extends Person{
    private String typeOfCustomer; //Loại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member).
    private String address;

    public Customer(int id,
                    String name,
                    String dayOfBirth,
                    String gender,
                    String soCmnd,
                    String phoneNumber,
                    String email,
                    String typeOfCustomer,
                    String address) {
        super(id, name, dayOfBirth, gender, soCmnd, phoneNumber, email);
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String typeOfCustomer, String address) {
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer() {
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+
                "typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
