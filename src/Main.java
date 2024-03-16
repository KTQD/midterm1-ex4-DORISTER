package thread;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 2, 7, 8, 0, 4, 3, 9, 2, 8, 1, 0, 5, 7, 4, 6, 9, 3, 2, 1, 8, 4, 0, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0, 8, 4, 6, 7, 9, 5, 3, 2, 1, 0};
    
        // Tạo và khởi chạy luồng tính tổng
        Thread sumThread = new Thread(new SumCalculator(numbers));
        sumThread.start();

        // Tạo và khởi chạy luồng tìm phần tử lớn nhất
        Thread maxThread = new Thread(new MaxElementFinder(numbers));
        maxThread.start();
    }
}

// Luồng tính tổng của các phần tử trong mảng
class SumCalculator implements Runnable {
    private int[] numbers;

    public SumCalculator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Tổng của các phần tử trong mảng là: " + sum);
    }
}

// Luồng tìm phần tử lớn nhất trong mảng
class MaxElementFinder implements Runnable {
    private int[] numbers;

    public MaxElementFinder(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Phần tử lớn nhất trong mảng là: " + max);
    }
}

    
  
