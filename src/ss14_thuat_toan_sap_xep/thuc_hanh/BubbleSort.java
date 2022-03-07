package ss14_thuat_toan_sap_xep.thuc_hanh;

public class BubbleSort {
    static int[] list = {6, 5, -6, 9, 4, 21, 16, 25, 30};

    public static void bubbleSort(int[] list) {
        boolean check = true;
        for (int i = 0; i < list.length && check; i++) {
            check = false;
            for (int j = list.length-1; j > i; j--) {
                if (list[j] < list[j - 1]) {
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                    check = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int j = 0; j < list.length; j++) {
            System.out.println(list[j] + "");
        }
    }
}
