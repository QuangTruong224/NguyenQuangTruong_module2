package ss16_io_text_file.thuc_hanh.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File ko tồn tại hoặc ko có nội dung");
        }
        return number;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Giá trị lớn nhất là :" + max);
            bufferedWriter.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
public static int findMax(List<Integer> numbers) {
        int max=numbers.get(0);
    for (int i = 0; i < numbers.size(); i++) {
        if (max<numbers.get(i)) {
            max=numbers.get(i);
        }
    }
    return max;
}
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> number = readAndWriteFile.readFile("D:\\CodeGym\\module_2\\src\\ss16_io_text_file\\thuc_hanh\\file_text\\number.txt");
        int maxValue = findMax(number);
        readAndWriteFile.writeFile("D:\\CodeGym\\module_2\\src\\ss16_io_text_file\\thuc_hanh\\file\\result.txt",maxValue);
    }

}
