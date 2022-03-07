package ss14_thuat_toan_sap_xep.thuc_hanh;

public class SelectionSort {
    static double[] list = {1, 4.5, 6.6, 5.7, -4.5,9,25,6};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int indexMin = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    indexMin = j;


                }
            }
            if (indexMin != i) {
                list[indexMin] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }
    }
}
