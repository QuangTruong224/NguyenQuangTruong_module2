package ss14_thuat_toan_sap_xep.bai_tap;

public class InsertionSortByStep {
    public static void main(String[] args) {
        int []intArr= {1,56,8,79,44,26,99,-9,0,4};

        sapXepChen(intArr);
    }

    public static void sapXepChen(int[] array) {
        int x;
        int a;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            a = i;
            while (a > 0 && x < array[a - 1]) {
                array[a] = array[a - 1];
                a--;
            }
            array[a] = x;
        }
        for (int ar:array) {
            System.out.println(ar);
        }
    }
}
