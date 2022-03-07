package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập độ dài danh sách:");
        int size=scanner.nextInt();
        int[] list=new int[size];
        System.out.println("Nhập" + list.length + "giá trị");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("Bạn vừa nhập danh sách");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("Bắt đầu sắp xếp");
        insertionSort(list);
    }
    public  static  void  insertionSort ( int [] list) {
        int x;
        int pos;
        for (int i = 0; i < list.length; i++) {
        x= list[i];
        pos=i;
        while (pos>0 && x<= list[pos-1]) {
            list[pos]=list[pos-1];
            pos--;
            System.out.println("Lần thứ" + i+ pos +"" + Arrays.toString(list));
        }
        list[pos]=x;
            System.out.println("Sau lần thứ"+ i+ ":" + Arrays.toString(list));
        }
    }
}
