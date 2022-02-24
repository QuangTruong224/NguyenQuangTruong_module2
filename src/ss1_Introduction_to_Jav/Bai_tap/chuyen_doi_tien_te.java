package Ss1_Introduction_to_Jav.Bai_tap;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rate,usd,vnd;
        rate = 23000;
        System.out.println("Enter giá trị đô :");
        usd = scanner.nextDouble();
        vnd= usd*rate;
        System.out.println(vnd +"");
    }
}
