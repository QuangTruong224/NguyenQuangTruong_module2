package collection_review.models;

public  abstract class  Candidate {
    private int candidateId;
    private String name;
    private String birthDate;
    private String adress;
    private int phone;
    private String email;

    public Candidate() {
    }

    public Candidate(int candidateId, String name, String birthDate, String adress, int phone, String email) {
        this.candidateId = candidateId;
        this.name = name;
        this.birthDate = birthDate;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidateId=" + candidateId +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", adress='" + adress + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}

