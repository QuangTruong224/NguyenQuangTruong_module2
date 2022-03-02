package ss12_java_collection_framework.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Trường", 21);
        hashMap.put("Đăng", 22);
        hashMap.put("Bình", 19);
        hashMap.put("Linh", 25);
        System.out.println("Hiển thị học viên:");
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("HIển thị theo thứ tự giảm dần :");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Trường",21);
        linkedHashMap.put("Đăng",22);
        linkedHashMap.put("Bình",19);
        linkedHashMap.put("Linh",25);
        System.out.println("\nSố tuổi của:" +"Bình là" +linkedHashMap.get("Bình")+" tuổi");
    }
}
