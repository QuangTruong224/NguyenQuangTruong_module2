package ss5_access_modifier_static.bai_tap.xay_dung_lop;

public class Student {
    String name , classes;

    public Student(int i, String hoa) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student student=new Student(1, "hoa");
        student.setName("Trường");
        student.setClasses("Đệp trai");
        System.out.println(student.getName());
        System.out.println(student.getClasses());
    }
}
