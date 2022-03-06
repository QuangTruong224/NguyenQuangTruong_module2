package collection_review.controller;

import collection_review.service.ExperienceService;
import collection_review.service.FresherService;
import collection_review.service.InternService;
import collection_review.service.impl.ExperienceImpl;
import collection_review.service.impl.FresherImpl;
import collection_review.service.impl.InternImpl;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println(" CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1.Experience ");
            System.out.println("2.Fresh");
            System.out.println("3.Internship");
            System.out.println("4.Searching");
            System.out.println("5.Exit");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());


            } catch (NumberFormatException e) {
                System.out.println("Please enter");

            }
            switch (choice) {
                case 1:
                    addExperience();
                    break;
                case 2:
                    addFresh();
                    break;
                case 3:
                    addIntern();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(5);
            }
        }

    }

    public static void addExperience() {
        ExperienceService experienceService = new ExperienceImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.Add new Experience ");
            System.out.println("2.Exit");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please enter");

            }
            switch (choice) {
                case 1:
                    experienceService.addExperience();
                    break;
                case 2:
                    displayMenu();
                    break;

            }

        }
    }

    public static void addFresh() {
        FresherService fresherService = new FresherImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.Add new fresh ");
            System.out.println("2.Exit");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please enter");

            }
            switch (choice) {
                case 1:
                    fresherService.searchFresh();
                    break;
                case 2:
                    displayMenu();
                    break;

            }

        }

    }

    public static void addIntern() {
        InternService internService = new InternImpl();
        boolean check = true;
        int choice = 0;
        while (check) {
            System.out.println("1.Add new intern ");
            System.out.println("2.Exit");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please enter");

            }
            switch (choice) {
                case 1:
                    internService.addIntern();
                    break;
                case 2:
                    displayMenu();
                    break;

            }
        }
    }

    public static void search() {
        boolean check = true;
        int choice = 0;
        ExperienceService experienceService = new ExperienceImpl();
        FresherService fresherService = new FresherImpl();
        InternService internService = new InternImpl();
        while (check) {
            System.out.println("1.Search experience name");
            System.out.println("2.Search fresh name");
            System.out.println("3.Search intern name");
            System.out.println("4.Exit");
            Scanner scanner = new Scanner(System.in);
            try {
                choice = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please Enter");
            }
            switch (choice) {
                case 1:
                    experienceService.searchExperience();
                    break;
                case 2:
                    internService.searchIntern();
                    break;
                case 3:
                    fresherService.searchFresh();
                    break;
                case 4:
                    displayMenu();
                    break;
            }
        }
    }
}
