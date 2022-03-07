package ss14_thuat_toan_sap_xep.thuc_hanh;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("Begin sort processing");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean check = true;
        for (int i = 1; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("Swap" + list[j] + "with" + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
            if (check == false) {
                System.out.print("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the" + i + "sort:");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t");
            }
            System.out.println();
        }

    }
}


