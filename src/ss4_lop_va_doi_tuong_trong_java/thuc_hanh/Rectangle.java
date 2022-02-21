package ss4_lop_va_doi_tuong_trong_java.thuc_hanh;

public class Rectangle {
    double witdh;
    double height;

    public Rectangle(double witdh, double height) {
        this.witdh = witdh;
        this.height = height;
    }
    public double getArea() {
        return this.height*this.witdh;
    }
    public double getPremeiter() {
        return (this.height+ this.witdh)*2 ;
    }
    public String display() {
        return "Rectangle{" + "width=" + witdh + ", height=" + height + "}";
    }
}
