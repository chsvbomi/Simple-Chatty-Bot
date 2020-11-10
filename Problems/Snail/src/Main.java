import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int road=scanner.nextInt();
        int meterUp=scanner.nextInt();
        int meterDown=scanner.nextInt();
        int slip=meterUp-meterDown;
        int step=(road-meterUp)/slip+2;
        System.out.println(step);
    }
}
