import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number, sum = 0;
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        sum += number / 1000;
        sum += (number % 1000) / 100;
        sum += (number % 100) / 10;
        sum += (number % 10);
        System.out.println(sum);
    }
}

