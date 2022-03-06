package collection_review.service.impl;

import collection_review.models.Fresher;
import collection_review.service.FresherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FresherImpl implements FresherService {
    static List<Fresher> fresherList = new ArrayList<>();

    @Override
    public void addFresh() {
//        Validate validate = new Validate();
//        int candidateId, String name, String birthDate, String adress, int phone,
//        String email, int graduationDate, String graduationRank, String education
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input fresh id");
        int candidateId = Integer.parseInt(scanner.nextLine());
        System.out.println("Input fresh name");
        String name = scanner.nextLine();
        System.out.println("Input fresh birthdate");
        String birthDate = scanner.nextLine();
        System.out.println("Input fresh adress");
        String adress = scanner.nextLine();
        System.out.println("Input fresh phone");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Input fresh email");
        String email = scanner.nextLine();
        System.out.println("Input fresh graduation date");
        int graduationDate = Integer.parseInt(scanner.nextLine());
        System.out.println("Input fresh graduation rank");
        String graduationRank = scanner.nextLine();
        System.out.println("Input fresh education");
        String education = scanner.nextLine();
        Fresher fresher = new Fresher(candidateId, name, birthDate, adress, phone, email, graduationDate, graduationRank, education);
        fresherList.add(fresher);
    }

    @Override
    public void searchFresh() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input fresh search");
        String searchName=scanner.nextLine();
        for (int i = 0; i <fresherList.size() ; i++) {
        if (fresherList.get(i).getName().equals(searchName));
        fresherList.contains(i);
            System.out.println("Succesfully searched");
            System.out.println(fresherList.get(i));
            break;
        }
    }
}
