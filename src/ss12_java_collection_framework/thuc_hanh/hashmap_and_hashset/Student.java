package ss12_java_collection_framework.thuc_hanh.hashmap_and_hashset;

public class Student {
    private String name;
    private int age;
    private String adrress;

    public Student() {
    }

    public Student(String name, int age, String adrress) {
        this.name = name;
        this.age = age;
        this.adrress = adrress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", adrress='" + adrress + '\'' +
                '}';
    }
}
