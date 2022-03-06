package collection_review.models;

public class Fresher extends Candidate {
    private int graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(int graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(int candidateId, String name, String birthDate, String adress, int phone, String email, int graduationDate, String graduationRank, String education) {
        super(candidateId, name, birthDate, adress, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public int getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(int graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "candidateId=" + getCandidateId() +
                ", name='" + getName() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                ", adress='" + getAdress() + '\'' +
                ", phone=" + getPhone() +
                ", email='" + getEmail() +
                "graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
