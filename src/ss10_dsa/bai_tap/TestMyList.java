package ss10_dsa.bai_tap;

import ss5_access_modifier_static.thuc_hanh.Student;

public class TestMyList {
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
