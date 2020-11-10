import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days=scanner.nextInt();
        int food=scanner.nextInt();
        int ticket=scanner.nextInt();
        int number=scanner.nextInt();
        int price=(ticket*2)+(food*days)+(number*(days-1));
        System.out.println(price);
    }
}