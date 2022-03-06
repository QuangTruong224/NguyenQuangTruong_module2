package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class ChuoiLonNhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String chuoi=scanner.nextLine();
        LinkedList<Character> linkedList=new LinkedList<>();
        for (int i = 0; i < chuoi.length(); i++) {
            LinkedList<Character> list=new LinkedList<>();
            list.add(chuoi.charAt(i));
            for (int j = 0; j < chuoi.length(); j++) {
                if (chuoi.charAt(j)>list.getLast()) {
                    list.add(chuoi.charAt(j));
                    if (list.size()>linkedList.size()) {
                        linkedList.clear();
                        linkedList.addAll(list);
                    }
                    list.clear();
                }
                for (Character character: linkedList
                     ) {
                    System.out.println(character);
                }
                System.out.println();
            }
        }
    }
}
