package ss10_dsa.thuc_hanh.list;

public class MyList <E>{
    int size=0;
    static final  int DEFAULT_CAPACITY=10;
    private Object element[];
    public MyList() {
        element=new Object[DEFAULT_CAPACITY];
    }
}
