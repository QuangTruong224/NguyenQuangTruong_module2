package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    private double a,b,c;

    public PhuongTrinhBac2(){

    }

    public PhuongTrinhBac2(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public double getDiscriminant(){
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getEqualRoot(){
        return -this.b / 2 * this.a;
    }
    public double getRoot1() {
        return (-this.b + Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / 2 * this.a;
    }
    public double getRoot2() {
        return (-this.b - Math.pow(this.b * this.b - 4 * this.a * this.c, 0.5)) / 2 * this.a;
    }
    public String display() {
        return "QuadraticEquation{" + this.a + " x 2 " + this.b + " x " + this.c + " = 0 }";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        double a = scanner.nextDouble();
        System.out.println("Enter b");
        double b = scanner.nextDouble();
        System.out.println("Enter c");
        double c = scanner.nextDouble();
        PhuongTrinhBac2 quadraticEquation = new PhuongTrinhBac2(a, b, c);
        System.out.println(quadraticEquation.display());
        System.out.println("Delta is: " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("Root 1 & 2 is: " + quadraticEquation.getRoot1() + " & " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one root is: " + quadraticEquation.getEqualRoot());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
