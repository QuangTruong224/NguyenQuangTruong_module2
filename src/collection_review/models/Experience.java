package collection_review.models;

public class Experience extends Candidate{
    private int yearOfExperience;
    private String professionalSkill;

    public Experience() {
    }

    public Experience(int yearOfExperience, String professionalSkill) {
        this.yearOfExperience = yearOfExperience;
        this.professionalSkill = professionalSkill;
    }

    public Experience(int candidateId, String name, String birthDate, String adress, int phone, String email, int yearOfExperience, String professionalSkill) {
        super(candidateId, name, birthDate, adress, phone, email);
        this.yearOfExperience = yearOfExperience;
        this.professionalSkill = professionalSkill;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }

    @Override
    public String toString() {
        return "Experience{" +
                "candidateId=" + getCandidateId() +
                ", name='" + getName() + '\'' +
                ", birthDate='" + getBirthDate() + '\'' +
                ", adress='" + getAdress() + '\'' +
                ", phone=" + getPhone() +
                ", email='" + getEmail() +
                "yearOfExperience=" + yearOfExperience +
                ", professionalSkill='" + professionalSkill + '\'' +
                '}';
    }
}

