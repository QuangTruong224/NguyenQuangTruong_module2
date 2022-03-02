package ss12_java_collection_framework.thuc_hanh.hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student("Trường",22,"Đà Nẵng");
        Student student2=new Student("Quang",25,"Huế");
        Student student3=new Student("Nguyên",26,"Sài gòn");
        Map<Integer,Student> studentMap=new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(4,student1);
        for (Map.Entry<Integer,Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }
        System.out.println("...set");
        Set<Student> students=new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student: students) {
            System.out.println(student.toString());
        }
    }

}
