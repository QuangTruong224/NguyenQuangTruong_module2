package case_study.models;

public class Employee extends Person{
    private String prof;
    private String level;
    private int payment;

    public Employee(int id,
                    String name,
                    String dayOfBirth,
                    String gender,
                    String soCmnd,
                    String phoneNumber,
                    String email,
                    String prof,
                    String level,
                    int payment) {
        super(id, name, dayOfBirth, gender, soCmnd, phoneNumber, email);
        this.prof = prof;
        this.level = level;
        this.payment = payment;
    }

    public Employee(String prof, String level, int payment) {
        this.prof = prof;
        this.level = level;
        this.payment = payment;
    }

    public Employee() {
    }

    public String getProf() {
        return prof;
    }

    public void setProf(String prof) {
        this.prof = prof;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return super.toString()+
                "prof='" + prof + '\'' +
                ", level='" + level + '\'' +
                ", payment=" + payment ;
    }
}
