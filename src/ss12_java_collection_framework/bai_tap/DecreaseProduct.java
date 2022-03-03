package ss12_java_collection_framework.bai_tap;

import java.util.Comparator;

public class DecreaseProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getGia() == o2.getGia()) {
            return 0;
        } else if (o1.getGia() >= o2.getGia()) {
            return -1;
        } else {
            return 1;
        }
    }
}

