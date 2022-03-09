package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dần file gốc: ");
        String path = scanner.nextLine();
        CopyFileText copyFileText = new CopyFileText();
        List<String> stringList = copyFileText.readFile(path);
        System.out.println("Nhập đường dẫn file cần viết đè: ");
        String outPath = scanner.nextLine();
        copyFileText.writeFile(outPath, stringList);

    }

    public List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();
        File file = new File(path);
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (Exception exception) {
            System.out.println("File không tồn tại hoặc nội dung có lỗi!");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        return stringList;
    }

    public List<String> writeFile(String path, List<String> stringList) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(String.valueOf(stringList));
            bufferedWriter.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return stringList;
    }
}
