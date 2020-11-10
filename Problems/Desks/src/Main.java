import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int students;
        int tables = 0;
        for (int i = 0; i < 3; i++) {
            students = scanner.nextInt();
            tables += (students + students % 2) / 2;
        }
        System.out.println(tables);
    }
}