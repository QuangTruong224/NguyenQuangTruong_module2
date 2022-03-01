package ss11_stack_queue.bai_tap;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            stack.push(arr[i]);
        }
        System.out.println("Dãy số của mảng :");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Đảo ngược các phần tử:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(stack.pop());
        }
    }
}
