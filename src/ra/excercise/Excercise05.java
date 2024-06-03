package ra.excercise;

import java.util.Arrays;

public class Excercise05 {
    public static void main(String[] args) {
        // Tạo một mảng số nguyên
        int[] numbers = {5,1,15,7,9,20,35,40};

        // In ra thông báo
        System.out.println("các số nguyên trong mảng là:");

        // Sử dụng Stream API để lọc các số nguyên và hiển thị chúng ra màn hình
        Arrays.stream(numbers)
                .filter(num -> num >0) // Lọc các số nguyên lớn hơn 0
                .forEach(System.out::println);
    }
}
