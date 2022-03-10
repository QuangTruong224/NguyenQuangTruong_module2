package ss16_io_text_file.bai_tap.reallife_csv;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadCSV {
    private void readFileCSV(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(path);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (Exception e){
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadCSV readCSV = new ReadCSV();
        readCSV.readFileCSV(path);
    }
}
