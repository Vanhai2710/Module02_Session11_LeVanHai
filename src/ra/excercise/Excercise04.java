package ra.excercise;

import java.util.Arrays;

public class Excercise04 {
    public static void main(String[] args) {
        // Tạo một mảng chuỗi
        String[] strings= {"Banana","Apple","Durian","Cherry","Grape"};

        // Sử dụng Stream API và phương thức sorted() để sắp xếp các chuỗi theo thứ tự bảng chữ cái
        String[] sortedStrings = Arrays.stream(strings)
                .sorted()
                .toArray(String[]::new);

        // In ra kết quả
        System.out.println("Chuỗi sắp xếp theo bảng chữ cái:");
        for (String str : sortedStrings) {
            System.out.println(str);
        }
    }
}
