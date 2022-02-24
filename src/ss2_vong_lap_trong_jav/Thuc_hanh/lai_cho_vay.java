package Ss2_vong_lap_trong_jav.Thuc_hanh;

import java.util.Scanner;

public class lai_cho_vay {

        public static void main(String[] args) {
            double money = 1.0;
            int month = 1;
            double interestRate =1.0;
            Scanner input = new Scanner (System.in);
            System.out.println("nhập số tiền gửi : " );
            money = input.nextDouble();
            System.out.println("nhập số tháng gửi : ");
            month = input.nextInt();
            System.out.println("nhập lãi suất : ");
            interestRate = input.nextDouble();
            double laiSuat =0;
            for ( int i =0; i<month;i++) {
                laiSuat += money * (interestRate/100)/12 * month;
                System.out.println("lãi suất là :" + laiSuat);
            }

        }
    }
