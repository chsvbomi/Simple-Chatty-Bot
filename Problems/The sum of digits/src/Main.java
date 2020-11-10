import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int hundreds = input / 100;
        int hundredsRemainder = input % 100;
        int tens = hundredsRemainder / 10;
        int ones = hundredsRemainder % 10;
        System.out.println(hundreds+tens+ones);
    }
}