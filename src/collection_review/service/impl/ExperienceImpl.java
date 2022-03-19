package collection_review.service.impl;

import collection_review.models.Experience;
import collection_review.service.ExperienceService;
//import collection_review.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceImpl implements ExperienceService {
    static List<Experience> experienceList = new ArrayList<>();
//    RegexData  validate = new RegexData();

    @Override
    public void addExperience() {
//        RegexData validate = new RegexData();
//        int candidateId, String name, String birthDate,
//        String adress, int phone, String email, int yearOfExperience,
//        String professionalSkill
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input experience id:");
        int candidateId = Integer.parseInt(scanner.nextLine());
        System.out.println("Input experience name");
        String name = scanner.nextLine();
        System.out.println("Input experience birthdate");
        String birthDate = scanner.nextLine();
        System.out.println("input experience adress");
        String adress = scanner.nextLine();
        System.out.println("Input expertien phonenumber");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("input experience email");
        String email = scanner.nextLine();
        System.out.println("Input year of experience");
        int yearOfExperience = Integer.parseInt(scanner.nextLine());
        System.out.println("Input experience professional skill");
        String professionalSkill = scanner.nextLine();
        Experience experience = new Experience(candidateId, name, birthDate, adress, phone, email, yearOfExperience, professionalSkill);
        experienceList.add(experience);
    }

    @Override
    public void searchExperience() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input experience search");
        String searchName = scanner.nextLine();
        for (int i = 0; i < experienceList.size(); i++) {
            if (experienceList.get(i).getName().equals(searchName)) {
                experienceList.contains(i);
                System.out.println("successfully searched");
                System.out.println(experienceList.get(i));
                break;
            }
        }
    }
}
