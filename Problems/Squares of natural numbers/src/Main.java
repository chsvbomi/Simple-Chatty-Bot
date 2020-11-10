import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//если бы я был тобой, я бы слился тоже, на твоём бы месте мэн, я бы слился тоже
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println(j);
                }
            }
        }
    }
}