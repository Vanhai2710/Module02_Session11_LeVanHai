package ra.excercise;

import java.util.Arrays;
import java.util.OptionalInt;

public class Excercise01 {
    public static void main(String[] args) {
        // Tạo một mảng số nguyên
        int[] numbers = {10, 20, 5, 15, 30, 25};

        // Sử dụng Stream API để tìm số lớn nhất
        OptionalInt max = Arrays.stream(numbers).max();

        // Kiểm tra và in kết quả
        if (max.isPresent()) {
            System.out.println("Số lớn nhất trong mảng là: " + max.getAsInt());
        } else {
            System.out.println("Mảng rỗng, không có số lớn nhất.");
        }
    }
}
