package ra.excercise;

import java.util.Arrays;

public class Excercise03 {
    public static void main(String[] args) {
        // Tạo một mảng số nguyên
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

        // Sử dụng Stream API và phương thức reduce để tính tổng các phần tử trong mảng
        int sum = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a + b);

        // In kết quả
        System.out.println("Tổng các phần tử trong mảng là: " + sum);
    }
}
