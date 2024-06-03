package ra.excercise;

import java.util.Arrays;

public class Excercise06 {
    public static void main(String[] args) {
        // Tạo 1 mảng chuỗi
        String[] strings = {"banana", "apple", "orange", "kiwi"};

        // Sử dụng Stream API và phương thức map() để chuyển đổi các chuỗi thành IN HOA
        String[] upperCaseStrings = Arrays.stream(strings)
                .map(String::toUpperCase) // chuyển mỗi chuỗi thành in hoa
                .toArray(String[]::new);

        // In kết quả
        System.out.println("Chuỗi đã được chuyển đổi thành in hoa:");
        for (String str : upperCaseStrings) {
            System.out.println(str);
        }
    }
}
