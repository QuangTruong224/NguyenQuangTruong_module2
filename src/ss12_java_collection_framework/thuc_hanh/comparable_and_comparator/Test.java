package ss12_java_collection_framework.thuc_hanh.comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student("Trường",22,"ĐN");
        Student student2=new Student("Ngọc",25,"SG");
        Student student3=new Student("Mạnh",28,"ĐN");
        Student student4=new Student("Lan",20,"HN");
        List<Student> list=new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        Collections.sort(list);
        for(Student st : list){
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("So sanh theo tuoi:");
        for(Student st : list){
            System.out.println(st.toString());
        }
    }
}
