package ss11_stack_queue.bai_tap;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
public class DemSoLanXuatHien {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào 1 chuỗi");
            String str = scanner.nextLine();
            Character keys;
            Map<Character,Integer> treeMap = new TreeMap<>();
            for (int i = 0; i < str.length();i++){
                keys = str.charAt(i);
                if (treeMap.containsKey(keys)){
                    int count = treeMap.get(keys);
                    treeMap.put(keys,count + 1);
                }else {
                    treeMap.put(keys,1);
                }
            }
            System.out.println(treeMap);
        }
}
