package ss10_dsa.bai_tap;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(3);
        a.add(4);

        System.out.println(a.clone());
    }
}
