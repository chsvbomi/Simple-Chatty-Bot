import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        int b=a/100;
        int c=a%100;
        int d=c/10;
        int e=c%10;
        System.out.println(e*100+d*10+b);
    }
}