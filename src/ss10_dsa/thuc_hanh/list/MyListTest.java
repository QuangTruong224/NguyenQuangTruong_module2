package ss10_dsa.thuc_hanh.list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);


        System.out.println("element 6:" + listInteger.get(6));
        System.out.println("element 1:" + listInteger.get(1));
        System.out.println("element 4:" + listInteger.get(4));
    }
}
