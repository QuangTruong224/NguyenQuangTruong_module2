package ss4_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan (int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    public Fan(){};
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if (this.getOn()){
            return "Fan has radius: " + this.getRadius() + " with color " + this.getColor() + ". It is turning on with speed: " + this.getSpeed();
        } else {
            return "Fan has radius: " + this.getRadius() + " with color " + this.getColor() + ". It is turning off";

        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed of fan 1 & fan 2, respectively");
        int speed1 = scanner.nextInt();
        int speed2 = scanner.nextInt();
        System.out.println("Enter the on/off of fan 1 & fan 2, respectively");
        boolean on1 = scanner.nextBoolean();
        boolean on2 = scanner.nextBoolean();
        System.out.println("Enter the radius of fan 1 & fan 2, respectively");
        double radius1 = scanner.nextDouble();
        double radius2 = scanner.nextDouble();
        System.out.println("Enter the color of fan 1 & fan 2, respectively");
        String color1 = scanner.next();
        String color2 = scanner.next();
        Fan fan = new Fan();
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(speed1);
        fan1.setOn(on1);
        fan1.setRadius(radius1);
        fan1.setColor(color1);

        fan2.setSpeed(speed2);
        fan2.setOn(on2);
        fan2.setRadius(radius2);
        fan2.setColor(color2);
        System.out.println(fan.toString());
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}

