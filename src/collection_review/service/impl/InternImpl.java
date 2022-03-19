package collection_review.service.impl;

import collection_review.models.Intern;
import collection_review.service.InternService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InternImpl implements InternService {
    static List<Intern> internList = new ArrayList<>();

    @Override
    public void addIntern() {
//        RegexData validate = new RegexData();
//        int candidateId, String name, String birthDate, String adress,
//        int phone, String email, String majors, String semeter, String universityName
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input intern id");
        int candidateId=Integer.parseInt(scanner.nextLine());
        System.out.println("Input intern name");
        String name = scanner.nextLine();
        System.out.println("Input intern birthdate");
        String birthDate = scanner.nextLine();
        System.out.println("Input intern adress");
        String adress = scanner.nextLine();
        System.out.println("Input intern phone");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Input intern email");
        String email = scanner.nextLine();
        System.out.println("Input intern majors");
        String majors=scanner.nextLine();
        System.out.println("Input intern semeter");
        String semeter=scanner.nextLine();
        System.out.println("Input intern university name");
        String universityName=scanner.nextLine();
        Intern intern=new Intern(candidateId,name,birthDate,adress,phone,email,majors,semeter,universityName);
        internList.add(intern);
    }

    @Override
    public void searchIntern() {
Scanner scanner=new Scanner(System.in);
        System.out.println("Input inter search");
        String searchName=scanner.nextLine();
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getName().equals(searchName)) {
                internList.contains(i);
                System.out.println("Successfully search");
                System.out.println(internList.get(i));
                break;
            }
        }
    }
}
