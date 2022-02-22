package ss5_access_modifier_static.thuc_hanh;

public class Student {
    private int rollno;
     private String name;
    private static String college="Codegym";

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }


        static void change() {
            college="Codegym";
        }
        void display() {
            System.out.println(rollno + "" + name + "" + college);
        }
    public static void main(String[] args) {
       Student student1=new Student(1,"Trường");
       Student student22=new Student(2,"Ha");
       student22.display();
       student1.display();
    }
}
