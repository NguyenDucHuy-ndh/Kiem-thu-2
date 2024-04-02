import java.util.Scanner;

public class Main {
    public static int countDigits(int n) {
        if (n < 0)
            n = n * -1;

        int count = 0;
        while (n >= 10) {
            count++;
            n /= 10;
        }
        count = count + 1;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên n: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Số lượng chữ số của số nguyên n là:" + countDigits(number));
    }
}
