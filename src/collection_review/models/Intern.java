package collection_review.models;

public class Intern extends Candidate{
    private String majors;
    private String semeter;
    private String universityName;

    public Intern() {
    }

    public Intern(String majors, String semeter, String universityName) {
        this.majors = majors;
        this.semeter = semeter;
        this.universityName = universityName;
    }

    public Intern(int candidateId, String name, String birthDate, String adress, int phone, String email, String majors, String semeter, String universityName) {
        super(candidateId, name, birthDate, adress, phone, email);
        this.majors = majors;
        this.semeter = semeter;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemeter() {
        return semeter;
    }

    public void setSemeter(String semeter) {
        this.semeter = semeter;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "candidateId=" +getCandidateId() +
                ", name='" + getName() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                ", adress='" + getAdress() + '\'' +
                ", phone=" + getPhone() +
                ", email='" + getEmail() +
                "majors='" + majors + '\'' +
                ", semeter='" + semeter + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}
