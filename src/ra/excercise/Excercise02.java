package ra.excercise;

import java.util.Arrays;

public class Excercise02 {
    public static void main(String[] args) {
        // Tạo một mảng số nguyên
        int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40};

        // In ra thông báo
        System.out.println("Các số chẵn trong mảng là:");

        // Sử dụng Stream API để lọc các số chẵn và in ra màn hình
        Arrays.stream(numbers)
                .filter(num -> num % 2 == 0)
                . forEach(System.out::println);


    }
}
