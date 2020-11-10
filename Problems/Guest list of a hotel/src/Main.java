//put imports you need here
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = new String[8];
        for (int i = 0; i < 8; i++) {
            data[i] = sc.next();
        }
        for (int j = data.length - 1; j >= 0; --j) {
            System.out.println(data[j]);
        }
    }
}