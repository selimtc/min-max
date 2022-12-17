import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("En buyuk ve en kucuk sayılar ?");
        int n = inp.nextInt();
        int max = 0, min = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Sayı girin");
            int number = inp.nextInt();

            if (i == 0) {
                max = number;
                min = number;
            }

            if (number > max) {
                max = number;
            } else if (number < min) {
                min = number;
            }
        }
        System.out.println("Min : " + min + "\nMax" + max);
    }
}